package com.zhf.myframe.presenter;

import android.os.Handler;

import com.zhf.myframe.base.BaseMvpPresenter;
import com.zhf.myframe.base.MyApplication;
import com.zhf.myframe.contract.MainContract;
import com.zhf.myframe.model.DataHelper;
import com.zhf.myframe.model.http.HttpNoResult;
import com.zhf.myframe.model.http.MyRxUtils;
import com.zhf.myframe.model.http.MySubscriber;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:46
 */
public class MainPresenter extends BaseMvpPresenter<MainContract.IView>
        implements MainContract.Presenter {

    private DataHelper dataHelper;

    @Inject
    MainPresenter() {
        dataHelper = MyApplication.getAppComponent().getDataHelper();
    }

    @Override
    public void loadData() {
        addSubscribe(dataHelper.loginCode("134xxxxxxxx")
                .compose(MyRxUtils.toMain(Schedulers.io()))
                .subscribeWith(new MySubscriber<HttpNoResult>(baseView, true) {
                    @Override
                    public void onNext(HttpNoResult httpNoResult) {
                        baseView.hideLoading();
                        baseView.showTipMsg("加载数据  完成");

                    }

                    @Override
                    public void onError(Throwable t) {
                        super.onError(t);
                        baseView.showTipMsg("加载数据  ERROR");
                    }
                }));


//        baseView.showTipMsg("加载数据");
}
}
