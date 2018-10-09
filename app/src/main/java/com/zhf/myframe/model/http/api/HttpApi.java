package com.zhf.myframe.model.http.api;

import com.zhf.myframe.model.http.HttpNoResult;
import com.zhf.myframe.model.http.ProtocolHttp;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 *  网络请求接口api
 *
 * @author zhf QQ:578121695
 * @time 2018/10/8 14:28
 */
public interface HttpApi {
  /**
   * 登录时获取验证码.
   *
   * @param phone 手机号
   * @return {"code":0}
   */
  @FormUrlEncoded
  @POST(ProtocolHttp.METHOD_LOGIN_CODE)
  Flowable<HttpNoResult> loginCode(@Field("phone") String phone);
}
