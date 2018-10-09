package com.zhf.myframe.base;

import android.support.annotation.StringRes;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/29 14:49
 */
public interface BaseView {
    void showTipMsg(String msg);

    void showTipMsg(@StringRes int msg);

    void showLoading();

    void hideLoading();

    void invalidToken();

    void myFinish();
}
