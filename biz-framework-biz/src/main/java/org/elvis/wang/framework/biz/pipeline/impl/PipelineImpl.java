package org.elvis.wang.framework.biz.pipeline.impl;

import org.elvis.wang.framework.api.dto.Request;
import org.elvis.wang.framework.api.dto.Response;
import org.elvis.wang.framework.biz.pipeline.*;
import org.elvis.wang.framework.biz.pipeline.exception.BizException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by zhiqun.wang on 2019/6/29 20:31
 */
public class PipelineImpl extends AbstractPipeline implements InitializingBean {

    private Convert converter;//转换器

    private List<Handler> handlers;//执行链路处理器

    @Override
    public HandlerContext getContext() {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (CollectionUtils.isEmpty(handlers)) {
            throw new IllegalArgumentException("handlers is required");
        }
        if (converter == null) {
            throw new IllegalArgumentException("converter is required");
        }
        tail = head;
        for (Handler handler : handlers) {
            super.addHandler(handler);
        }
    }

    @Override
    public Response execute(Request request, HandlerContext context) {
        Response response = null;
        try {
            //请求参数转换 业务校验
            converter.cvtReq2Ctx(request, context);

            //执行配置调用链
            head.getNext().exec(context);

            //返回参数转换
            response = converter.cvtCtx2Resp(context);
        } catch (BizException bizEx) {
            //执行业务异常
            response = new Response(bizEx.getErrorCode(),bizEx.getErrorMessage());
        } catch (Exception ex) {
            response = new Response("9999","系统异常");
        }
        return response;
    }


    public void setHandlers(List<Handler> handlers) {
        this.handlers = handlers;
    }

    public void setConverter(Convert converter) {
        this.converter = converter;
    }

}
