package com.zhf.myframe.di.component;

import com.zhf.myframe.di.module.AppModule;
import com.zhf.myframe.di.module.HttpModule;
import com.zhf.myframe.model.DataHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:34
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    DataHelper getDataHelper();
}