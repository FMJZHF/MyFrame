package com.zhf.myframe.model.http;

import io.reactivex.Flowable;

/**
 *  网络接口，接口参数Token统一处理，方法中不传Token
 *
 * @author zhf QQ:578121695
 * @time 2018/10/8 10:52
 */
public interface HttpHelper {
  /**
   * 登录时获取验证码.
   *
   * @param phone 手机号
   * @return {"code":0}
   */
  Flowable<HttpNoResult> loginCode(String phone);
  /*Flowable<HttpResult<Login>> login(String phone, String code);
  Flowable<HttpResult<List<DiyBean>>> diyKeys(String allId);*/
}
