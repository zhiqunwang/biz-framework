package org.elvis.wang.framework.biz.pipeline;

import org.elvis.wang.framework.api.dto.Response;

import java.io.Serializable;

/**
 * Created by zhiqun.wang on 2019/6/27 07:44
 */
public interface Convert {

    /**
     * 请求转上下文
     *
     * @author frank
     * @param req
     * @param context
     * @return
     */
    <T extends Serializable> HandlerContext cvtReq2Ctx(T req, HandlerContext context);

    /**
     * 上下文转应答
     *
     * @author frank
     * @param ctx
     * @return
     */
    Response cvtCtx2Resp(HandlerContext ctx);
}
