package com.zhf.myframe.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 
 * @author zhf QQ:578121695
 * @time 2018/10/8 14:46
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiUrl {
}
