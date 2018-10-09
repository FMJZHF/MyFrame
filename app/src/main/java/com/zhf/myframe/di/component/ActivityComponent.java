package com.zhf.myframe.di.component;

import com.zhf.myframe.MainActivity;
import com.zhf.myframe.di.module.ActivityModule;
import com.zhf.myframe.di.scope.ActivityScope;

import dagger.Component;

/**
 * ${DESC}
 *
 * @author zhf QQ:578121695
 * @time 2018/9/30 10:33
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
