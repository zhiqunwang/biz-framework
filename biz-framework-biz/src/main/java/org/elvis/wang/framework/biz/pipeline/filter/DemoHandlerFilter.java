package org.elvis.wang.framework.biz.pipeline.filter;

import org.elvis.wang.framework.biz.pipeline.HandlerContext;
import org.elvis.wang.framework.biz.pipeline.HandlerItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by zhiqun.wang on 2019/6/30 10:17
 */
public class DemoHandlerFilter extends AbstractHandlerFilter {
    private Logger logger = LoggerFactory.getLogger(DemoHandlerFilter.class);
    @Override
    public LinkedList<HandlerItem<HandlerContext>> doFilter(HandlerContext context, Map<String, HandlerItem<HandlerContext>> itemMap) {
        logger.info("执行doFilter过滤,usetId={}",context.getProperty("userId"));
        return getDefaultHandlerItems(itemMap);
    }
}
