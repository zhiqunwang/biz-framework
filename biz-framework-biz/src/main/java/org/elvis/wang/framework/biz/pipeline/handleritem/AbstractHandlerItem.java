package org.elvis.wang.framework.biz.pipeline.handleritem;

import org.elvis.wang.framework.biz.pipeline.HandlerContext;
import org.elvis.wang.framework.biz.pipeline.HandlerItem;

/**
 * Created by zhiqun.wang on 2019/6/30 10:31
 */
public abstract class AbstractHandlerItem implements HandlerItem<HandlerContext> {

    private Integer execOrder;

    public void setExecOrder(Integer execOrder){
        this.execOrder = execOrder;
    }

    @Override
    public Integer getExecOrder() {
        return this.execOrder;
    }

    @Override
    abstract public boolean execute(HandlerContext handlerContext);


}
