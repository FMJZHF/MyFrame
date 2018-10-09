package com.zhf.myframe.model.http;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 *  Desc:切换线程的工具类
 *
 * @author zhf QQ:578121695
 * @time 2018/10/8 14:44
 */
public class MyRxUtils {
  /**
   * 从其他线程转到主线程.
   *
   * @param scheduler Schedulers.io()等等
   * @param <T>       t
   * @return FlowableTransformer
   */
  public static <T> FlowableTransformer<T, T> toMain(Scheduler scheduler) {
    return upstream -> upstream.subscribeOn(scheduler).observeOn(AndroidSchedulers.mainThread());
  }

  public static <T> FlowableTransformer<HttpResult<T>, T> handResult() {
    return upstream -> upstream.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .flatMap(tHttpResult -> {
          if (tHttpResult.getCode() == HttpCode.SUCCESS) {
            return /*createData(tHttpResult.data)*/Flowable.just(tHttpResult.getData());
          } else {
            return Flowable.error(new ApiException(tHttpResult.getCode(), tHttpResult.getMsg()));
          }
        });
  }

  private static <T> Flowable<T> createData(final T data) {
    return Flowable.create(e -> {
      e.onNext(data);
      e.onComplete();
    }, BackpressureStrategy.ERROR);
  }
}
