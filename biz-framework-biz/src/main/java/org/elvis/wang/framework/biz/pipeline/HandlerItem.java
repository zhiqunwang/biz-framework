package org.elvis.wang.framework.biz.pipeline;

/**
 * Created by zhiqun.wang on 2019/6/27 07:44
 */
public interface HandlerItem<T extends HandlerContext>  {

    /**
     * 执行顺序
     *
     * @return
     */
    Integer getExecOrder();

    /**
     * 执行
     *
     * @param t
     * @return
     */
    boolean execute(T t);
}
