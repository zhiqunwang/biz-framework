package org.elvis.wang.framework.biz.pipeline;
/**
 * Created by zhiqun.wang on 2019/6/26 23:03
 */
public interface Handler {


    /**
     * 执行具体业务
     *
     * @param context
     * @return true则继续执行下一个Handler，否则结束Handler Chain的执行直接返回
     */
    boolean handle(HandlerContext context);
}
