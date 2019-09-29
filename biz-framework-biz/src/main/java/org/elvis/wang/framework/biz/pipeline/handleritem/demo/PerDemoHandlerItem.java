package org.elvis.wang.framework.biz.pipeline.handleritem.demo;

import org.elvis.wang.framework.biz.pipeline.HandlerContext;
import org.elvis.wang.framework.biz.pipeline.handleritem.AbstractHandlerItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhiqun.wang on 2019/7/2 13:40
 */
public class PerDemoHandlerItem extends AbstractHandlerItem {
    private Logger logger = LoggerFactory.getLogger(PerDemoHandlerItem.class);

    @Override
    public boolean execute(HandlerContext handlerContext) {
        logger.info("执行PerDemoHandlerItem模块....userId={}",handlerContext.getProperty("userId"));
        return false;
    }
}
