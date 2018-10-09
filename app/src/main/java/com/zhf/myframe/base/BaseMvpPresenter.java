package com.zhf.myframe.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * 带mvp的presenter的基类
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:31
 */
public class BaseMvpPresenter<T extends BaseView> implements BasePresenter<T> {
    protected T baseView;
    private CompositeDisposable disposables;

    @Override
    public void attachView(T baseView) {
        this.baseView = baseView;
    }

    protected void addSubscribe(Disposable disposable) {
        if (null == disposables) {
            disposables = new CompositeDisposable();
        }
        disposables.add(disposable);
    }

    @Override
    public void detachView() {
        this.baseView = null;
        unSubscribe();
    }

    private void unSubscribe() {
        if (null != disposables) {
            disposables.clear();
            disposables = null;
        }
    }

}