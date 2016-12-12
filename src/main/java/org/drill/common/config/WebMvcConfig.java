package org.drill.common.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by gygesM on 2016/12/6.
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    private static final Logger logger = Logger.getLogger(WebMvcConfig.class);

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(messageConverter());
        super.configureMessageConverters(converters);
        logger.info("###添加GSON支持###");
    }

    private static GsonHttpMessageConverter messageConverter(){
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder
                .enableComplexMapKeySerialization()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        converter.setGson(gson);
        return converter;
    }
}
