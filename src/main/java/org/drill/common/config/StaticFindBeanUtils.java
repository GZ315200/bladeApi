//package org.drill.common.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
///**
// * Created by GygesM on 2016/12/18.
// *
// */
//@Component
//public class StaticFindBeanUtils implements ApplicationContextAware {
//
//    private ApplicationContext applicationContext;
//
//    private static ApplicationContext applicationContextInstance;
//
//    public static ObjectMapper objectMapperInstance;
//
//    /**
//     * 设置应用上下文关系
//      * @param applicationContext
//     * @throws BeansException
//     */
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        if (applicationContext.getParent() == null){
//            this.applicationContext = applicationContext;
//        }
//    }
//
//
//    @PostConstruct
//    private void getApplicationInstance() {
//        applicationContextInstance = this.applicationContext;
//        objectMapperInstance = this.applicationContext.getBean(ObjectMapper.class);
//    }
//
//    /**
//     * 获得bean的事例
//     * @param tClass
//     * @param <T>
//     * @return
//     */
//    public static <T> T getBeanInstance(Class<T> tClass) {
//        return applicationContextInstance.getBean(tClass);
//    }
//}
