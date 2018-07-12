package com.ryfchina.demo.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 重试异常
 *
 * @author zhanjin
 * @version 1.0
 * @description: 描述
 * @create 2018/05/10 12:55
 * @since JDK 1.8
 */
public class MyRetryException extends RuntimeException {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(MyRetryException.class);

    private String msg;

    private int code = 500;

    private Object data;

    public MyRetryException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public MyRetryException(String msg, Object data) {
        super(msg);
        this.data = data;
    }

    public MyRetryException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public MyRetryException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public MyRetryException(String msg, int code, Throwable e) {
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
