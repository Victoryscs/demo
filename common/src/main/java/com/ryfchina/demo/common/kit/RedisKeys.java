package com.ryfchina.demo.common.kit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Redis所有keys
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/7/29 18:31
 * @since JDK 1.8
 */
public class RedisKeys {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisKeys.class);

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }

}
