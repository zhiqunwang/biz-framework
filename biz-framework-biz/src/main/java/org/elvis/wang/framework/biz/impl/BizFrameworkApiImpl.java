package org.elvis.wang.framework.biz.impl;

import org.elvis.wang.framework.api.BizFrameworkApi;
import org.elvis.wang.framework.api.dto.PayRequest;
import org.elvis.wang.framework.api.dto.Response;
import org.elvis.wang.framework.biz.pipeline.Pipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhiqun.wang on 2019/7/2 13:59
 */
@Service
public class BizFrameworkApiImpl implements BizFrameworkApi {

    @Autowired
    private Pipeline demoPipeline;

    @Override
    public Response<Boolean> demo(PayRequest request) {
        //参数校验
        return demoPipeline.execute(request,null);
    }
}
