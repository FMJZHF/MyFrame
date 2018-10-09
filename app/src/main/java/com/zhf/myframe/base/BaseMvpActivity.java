package com.zhf.myframe.base;

import javax.inject.Inject;

/**
 *  带MVP的Activity
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:32
 */
public abstract class BaseMvpActivity<T extends BasePresenter>  extends BaseActivity{

    @Inject
    protected T basePresenter;

    @Override
    @SuppressWarnings("unchecked")
    protected void initView() {
        super.initView();
        initInject();
        if (null != basePresenter) {
            basePresenter.attachView(this);
        }
    }

    protected abstract void initInject();

    @Override
    protected void onDestroy() {
        if (null != basePresenter) {
            basePresenter.detachView();
            basePresenter = null;
        }
        super.onDestroy();
    }
}
