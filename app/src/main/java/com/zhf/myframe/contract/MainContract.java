package com.zhf.myframe.contract;

import com.zhf.myframe.base.BasePresenter;
import com.zhf.myframe.base.BaseView;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:45
 */
public interface MainContract {
    interface IView extends BaseView {

    }
    interface Presenter extends BasePresenter<IView> {
        void loadData();
    }
}
