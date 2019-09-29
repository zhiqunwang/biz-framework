package org.elvis.wang.framework.biz.pipeline.impl;

import org.elvis.wang.framework.biz.pipeline.*;

/**
 * Created by zhiqun.wang on 2019/6/27 07:56
 */
public abstract  class AbstractPipeline  implements Pipeline {

    protected HandlerInvoker tail = new HandlerInvoker();

    protected HandlerInvoker head = new HandlerInvoker();

    @Override
    public void addHandler(Handler... handlers) {
        HandlerInvoker next = tail;
        for (Handler handler : handlers) {
            if (handler == null) {
                continue;
            }

            HandlerInvoker node = new HandlerInvoker();
            node.setHandler(handler);
            next.setNext(node);
            next = node;
        }

        tail = next;
    }
}
