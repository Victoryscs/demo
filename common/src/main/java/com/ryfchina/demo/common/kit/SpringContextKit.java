package com.ryfchina.demo.common.kit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spring Context 帮助类
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/7/29 18:22
 * @since JDK 1.8
 */
public class SpringContextKit implements ApplicationContextAware {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringContextKit.class);

    public static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }

    public static <T> T getBean(String name ,Class<T> type){
        return applicationContext.getBean(name,type);
    }

    public static boolean containsBean(String name){
        return applicationContext.containsBean(name);
    }

    public static boolean isSingleton(String name){
        return applicationContext.isSingleton(name);
    }

    public static Class<? extends Object> getType(String name){
        return applicationContext.getType(name);
    }

}
