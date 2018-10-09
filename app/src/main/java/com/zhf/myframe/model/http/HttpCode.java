package com.zhf.myframe.model.http;


/**
 * 网络请求状态码
 *
 * @author zhf QQ:578121695
 * @time 2018/10/8 14:39
 */
public interface HttpCode {
    /**
     * 成功.
     */
    int SUCCESS = 0;
    /**
     * 参数为空.
     */
    int NO_PARAMETER = 1;
    /**
     * 服务器错误.
     */
    int SERVER_ERR = 3;
}
