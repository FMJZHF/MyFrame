package com.zhf.myframe.model.http;

/**
 *  Desc: 接口异常判断处理
 *
 * @author zhf QQ:578121695
 * @time 2018/10/8 14:43
 */
public class ApiException extends Exception {
  private int code;

  @SuppressWarnings("unused")
  public ApiException(int code) {
    this.code = code;
  }

  public ApiException(int code, String message) {
    super(message);
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public ApiException setCode(int code) {
    this.code = code;
    return this;
  }
}
