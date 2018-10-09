package com.zhf.myframe.di.module;

import com.zhf.myframe.base.MyApplication;
import com.zhf.myframe.model.DataHelper;
import com.zhf.myframe.model.http.HttpHelper;
import com.zhf.myframe.model.http.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:34
 */
@Module
public class AppModule {
    private MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    DataHelper provideDataHelper(HttpHelper httpHelper) {
        return new DataHelper(httpHelper);
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
        return retrofitHelper;
    }

}
