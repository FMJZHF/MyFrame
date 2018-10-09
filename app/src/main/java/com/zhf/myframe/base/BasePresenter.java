package com.zhf.myframe.base;

/**
 *  不带mvp的presenter的基类
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:31
 */
public interface BasePresenter <T extends BaseView> {
    void attachView(T baseView);

    void detachView();
}
