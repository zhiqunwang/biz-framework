package org.elvis.wang.framework.biz.pipeline;

import java.util.LinkedList;
import java.util.Map;

/**
 * Created by zhiqun.wang on 2019/6/29 22:07
 */
public interface HandlerFilter {

    /**
     * 过滤方法
     * @param context
     * @param itemMap
     * @return
     */
    LinkedList<HandlerItem<HandlerContext>> doFilter(HandlerContext context,
                                                     Map<String, HandlerItem<HandlerContext>> itemMap);
}
