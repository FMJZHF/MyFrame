package com.zhf.myframe.model.http;

import com.google.gson.annotations.SerializedName;

/**
 * 有解析数据的返回
 *
 * @author zhf QQ:578121695
 * @time 2018/10/8 10:17
 */
public class HttpResult<T> {
    private int code;
    private String msg;
    @SerializedName(value = "result")
    private T data;

    public int getCode() {
        return code;
    }

    public HttpResult setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public HttpResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public HttpResult setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "HttpResult{" + "code=" + code + ", msg='" + msg + '\'' + ", data=" + data + '}';
    }
}
