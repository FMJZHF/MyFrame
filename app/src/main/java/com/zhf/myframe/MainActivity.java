package com.zhf.myframe;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;

import com.zhf.myframe.base.BaseMvpActivity;
import com.zhf.myframe.contract.MainContract;
import com.zhf.myframe.presenter.MainPresenter;

/**
 * @author zhf QQ:578121695
 * @time 2018/9/29 14:57
 */
public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.IView {

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void initData() {
        super.initData();
        initToolbar(true, false, true).setMainTitle("主页").setRightTitle("更多");
//        basePresenter.loadData();
    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    protected void initView() {
        super.initView();
        setOnClick(R.id.tv_right_base_activity,R.id.tv_title_base_activity);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_right_base_activity:
                basePresenter.loadData();
               Log.e("TAG  ","更多");
                break;
            case R.id.tv_title_base_activity:

               Log.e("TAG  ","主页");
                break;
            default:
                break;
        }
    }

}
