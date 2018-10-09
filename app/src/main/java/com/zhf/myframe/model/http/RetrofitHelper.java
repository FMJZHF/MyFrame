package com.zhf.myframe.model.http;

import com.zhf.myframe.model.http.api.HttpApi;

import javax.inject.Inject;

import io.reactivex.Flowable;


/**
 *   网络接口Retrofit实现
 * @author zhf QQ:578121695
 * @time 2018/10/8 14:28
 */
public class RetrofitHelper implements HttpHelper {
  private HttpApi httpApi;

  @Inject
  RetrofitHelper(HttpApi httpApi) {
    this.httpApi = httpApi;
  }

  @Override
  public Flowable<HttpNoResult> loginCode(String phone) {
    return httpApi.loginCode(phone);
  }
}
