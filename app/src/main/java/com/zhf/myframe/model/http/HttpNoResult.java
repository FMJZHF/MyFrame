package com.zhf.myframe.model.http;

/**
 * 没有解析数据的返回
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:57
 */
public class HttpNoResult {
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public HttpNoResult setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public HttpNoResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "HttpNoResult{" + "code=" + code + ", msg='" + msg + '\'' + '}';
    }
}