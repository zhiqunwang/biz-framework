package org.elvis.wang.framework.biz.pipeline;

import org.elvis.wang.framework.api.dto.Request;
import org.elvis.wang.framework.api.dto.Response;

/**
 * Created by zhiqun.wang on 2019/6/26 23:02
 */
public interface Pipeline {

    /**
     * 获取上下文
     * @return
     */
    HandlerContext getContext();

    /**
     * 添加处理器节点
     * @param handlers
     */
     void addHandler(Handler... handlers);

    /**
     * 执行器
     * @param request
     * @param context
     * @return
     */
     Response execute(Request request, HandlerContext context);
}
