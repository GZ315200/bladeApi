package org.drill.utils;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;

/**
 * Created by gygesM on 2016/11/22.
 * 获取系统properties文件
 */
public class PropertiesLoader {
    private static Logger logger = LoggerFactory.getLogger(PropertiesLoader.class);

    private static ResourceLoader resourceLoader = new DefaultResourceLoader();

    private final Properties properties;

    /**
     * 获取文件的资源路径
     * @param resourcesPaths
     */
    public PropertiesLoader(String... resourcesPaths) {
        properties = loadProperties(resourcesPaths);
    }
    public Properties getProperties() {
        return properties;
    }

    /**
     * 取出properties里的值，以系统的properties文件优先
     * @param key
     * @return
     */
    public String getValue(String key){
        String systemProp = System.getProperty(key);
        if (systemProp != null){
            return systemProp;
        }
        if (properties.containsKey(key)){
            return properties.getProperty(key);
        }
        return "";
    }

    /**
     * 取出String类型的属性值，如果为空抛出异常
     * @param key
     * @return
     */
    public String getProperty(String key){
        String value = getValue(key);
        if (value == null){
            throw new NoSuchElementException();
        }
        return value;
    }

    /**
     * 取出string类型的值，如果为空返回默认值
     * @param key
     * @param defaultKey
     * @return
     */
    public String getProperty(String key,String defaultKey){
        String value = getValue(key);
        if (value == null){
            return defaultKey;
        }
        return value;
    }


    /**
     * 载入多个文件, 文件路径使用Spring Resource格式
     * @param resourcePaths
     * @return
     */
    private Properties loadProperties(String... resourcePaths){
        Properties properties = new Properties();
        for(String location : resourcePaths){

            InputStream in = null;
            try {
//                通过路径获取properties文件的资源
                Resource resource = resourceLoader.getResource(location);
                in = resource.getInputStream();//获得流文件读入
                properties.load(in);//加载
            }catch (IOException ex){
                logger.info("无法获取properties文件路径"+ location + "," + ex.getMessage());
            }finally {
                IOUtils.closeQuietly(in);
            }
        }
        return properties;
    }


}
