package org.elvis.wang.framework.biz.pipeline.filter;

import org.elvis.wang.framework.biz.pipeline.HandlerContext;
import org.elvis.wang.framework.biz.pipeline.HandlerFilter;
import org.elvis.wang.framework.biz.pipeline.HandlerItem;
import org.springframework.util.CollectionUtils;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhiqun.wang on 2019/7/2 21:48
 */
public abstract class AbstractHandlerFilter implements HandlerFilter {

    protected LinkedList<HandlerItem<HandlerContext>> getDefaultHandlerItems(
            Map<String, HandlerItem<HandlerContext>> itemMap) {
        if (CollectionUtils.isEmpty(itemMap)) {
            return new LinkedList<HandlerItem<HandlerContext>>();
        }else{
            Set<String> keySet = itemMap.keySet();
            LinkedList<HandlerItem<HandlerContext>> itemList = new LinkedList<HandlerItem<HandlerContext>>();
            for (String key : keySet) {
                itemList.add(itemMap.get(key));
            }
            return itemList;
        }
    }

    @Override
    public abstract LinkedList<HandlerItem<HandlerContext>> doFilter(
            HandlerContext context,
            Map<String, HandlerItem<HandlerContext>> itemMap);

}
