package com.zhf.myframe.utils;

import android.support.annotation.StringRes;
import android.view.Gravity;
import android.widget.Toast;

import com.zhf.myframe.base.MyApplication;

/**
 * 实时更新的Toast工具类
 *
 * @author zhf QQ:578121695
 * @time 2018/9/29 14:50
 */
public final  class ToastUtils {
    private static Toast toast;

    private ToastUtils() {
        throw new RuntimeException("工具类不允许创建对象");
    }

    @SuppressWarnings("all")
    private static void init() {
        if (toast == null) {
            toast = Toast.makeText(MyApplication.getInstance(), "", Toast.LENGTH_SHORT);
        }
    }

    public static void showTipMsg(String msg) {
        if (null == toast) {
            init();
        }
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setText(msg);
        toast.show();
    }

    public static void showTipMsg(@StringRes int msg) {
        if (null == toast) {
            init();
        }
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setText(msg);
        toast.show();
    }
}
