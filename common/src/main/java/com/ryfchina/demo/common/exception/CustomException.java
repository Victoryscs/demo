package com.ryfchina.demo.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义异常
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2017/7/29 12:55
 * @since JDK 1.8
 */
public class CustomException extends RuntimeException {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomException.class);

    private String msg;

    private String code = "500";

    public CustomException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public CustomException(String msg, String code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public CustomException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public CustomException(String msg, String code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
