package com.zhf.myframe.model;


import com.zhf.myframe.model.http.HttpHelper;
import com.zhf.myframe.model.http.HttpNoResult;

import io.reactivex.Flowable;

/**
 * 网络请求的实现类
 *
 * @author zhf QQ:578121695
 * @time 2018/10/8 10:54
 */
public class DataHelper implements HttpHelper {
  private HttpHelper http;

  public DataHelper(HttpHelper http) {
    this.http = http;
  }

  @Override
  public Flowable<HttpNoResult> loginCode(String phone) {
    return http.loginCode(phone);
  }
}
