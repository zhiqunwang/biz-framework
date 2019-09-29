package org.elvis.wang.framework.biz.pipeline.convert;

import org.elvis.wang.framework.api.dto.DemoRequest;
import org.elvis.wang.framework.api.dto.Response;
import org.elvis.wang.framework.biz.pipeline.Convert;
import org.elvis.wang.framework.biz.pipeline.HandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Created by zhiqun.wang on 2019/6/30 10:08
 */
public class DemoConvert implements Convert {

    private Logger logger = LoggerFactory.getLogger(DemoConvert.class);

    @Override
    public <T extends Serializable> HandlerContext cvtReq2Ctx(T req, HandlerContext context) {
        //处理参数转换
        DemoRequest request = (DemoRequest)req;
        logger.info("参数转换&业务逻辑校验模块..."+request.getUserId());
        context.setProperty("userId",request.getUserId());
        return context;
    }

    @Override
    public Response cvtCtx2Resp(HandlerContext ctx) {

        logger.info("出参封装..."+ ctx.getProperty("userId"));
        Response<Long> response = new Response();
        response.setData((Long) ctx.getProperty("userId"));
        return response;
    }
}
