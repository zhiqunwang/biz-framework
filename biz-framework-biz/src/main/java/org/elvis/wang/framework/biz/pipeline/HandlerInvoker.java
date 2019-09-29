package org.elvis.wang.framework.biz.pipeline;


/**
 * Created by zhiqun.wang on 2019/6/27 07:57
 *
 * HandlerInvoker--- Handler
 */
public class HandlerInvoker {

    private Handler handler;

    private HandlerInvoker next;

    public void exec(HandlerContext context) {
        Handler handler = this.handler;
        boolean succ = handler.handle(context);

        if (next != null && succ) {
            next.exec(context);
        }
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public HandlerInvoker getNext() {
        return next;
    }

    public void setNext(HandlerInvoker next) {
        this.next = next;
    }
}
