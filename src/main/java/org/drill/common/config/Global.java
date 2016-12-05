package org.drill.common.config;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.drill.utils.PropertiesLoader;

import java.util.Map;

/**
 * Created by gygesM on 2016/11/21.
 * @author gygesM
 *
 * 全局配置类
 */
public class Global {

    /**
     * 当前配置类实例化
     */
    public static Global global = new Global();
    /**
     *属性文件加载对象
     */
    public static PropertiesLoader loader = new PropertiesLoader("blade.properties");

    /**
     * 保存全局属性值
     */
    private static Map<String, String> map = Maps.newHashMap();

    /**
     * 获取当前 全局对象实例
     * @return
     */
    public static Global getInstance(){
        return global;
    }

    /**
     * 是/否
     */
    public static final String YES = "1";
    public static final String NO = "0";

    /**
     * 对/错
     */
    public static final String TRUE = "true";
    public static final String FALSE = "false";

    /**
     * 显示/隐藏
     */
    public static final String SHOW = "1";
    public static final String HIDE = "0";

    /**
     * 获取配置
     * @param key
     * @return
     */
    public static String getConfig(String key){
        String value = map.get(key);
        if (value == null){
            value = loader.getValue(key);
            map.put(key,value != null? value : StringUtils.EMPTY);
        }
        return value;
    }

    /**
     * 获取后台根目录路径
     * @return
     */
    public static String getAdminPath(){
        return Global.getConfig("adminPath");
    }

    /**
     * 获取前台根目录路径
     * @return
     */
    public static String getFrontPath(){
        return Global.getConfig("frontPath");
    }

//    public static void main(String[] args){
//        String adminPath = getAdminPath();
//        String frontPath = getFrontPath();
//        System.out.println(adminPath);
//        System.out.println(frontPath);
//    }
}
