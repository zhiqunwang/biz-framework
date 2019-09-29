package org.elvis.wang.framework.api;

import org.elvis.wang.framework.api.dto.PayRequest;
import org.elvis.wang.framework.api.dto.Response;

/**
 * Created by zhiqun.wang on 2019/7/2 13:49
 *
 * 对外提供SOA api
 */
public interface BizFrameworkApi {

    /**
     * demo 支付api
     * @param request
     * @return
     */
    Response<Boolean> demo(PayRequest request);


}
