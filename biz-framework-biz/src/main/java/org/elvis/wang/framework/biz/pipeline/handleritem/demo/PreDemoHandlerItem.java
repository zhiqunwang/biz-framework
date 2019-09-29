package org.elvis.wang.framework.biz.pipeline.handleritem.demo;

import org.elvis.wang.framework.biz.pipeline.HandlerContext;
import org.elvis.wang.framework.biz.pipeline.handleritem.AbstractHandlerItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhiqun.wang on 2019/6/30 10:34
 */
public class PreDemoHandlerItem extends AbstractHandlerItem {

    private Logger logger = LoggerFactory.getLogger(PreDemoHandlerItem.class);

    @Override
    public boolean execute(HandlerContext handlerContext) {
        logger.info("执行PreDemoHandlerItem模块....userId={}",handlerContext.getProperty("userId"));
        return true;
    }
}
