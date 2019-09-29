package org.elvis.wang.framework.biz.pipeline.handler;

import org.elvis.wang.framework.biz.pipeline.*;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * Created by zhiqun.wang on 2019/6/29 22:06
 */
public class DefaultHandler implements Handler {

    protected Map<String, HandlerItem<HandlerContext>> handlerItemMap;

    protected HandlerFilter handlerFilter;


    protected LinkedList<HandlerItem<HandlerContext>> sortItems(
            LinkedList<HandlerItem<HandlerContext>> handlerItems) {
        Collections.sort(handlerItems,
                new Comparator<HandlerItem<HandlerContext>>() {
                    @Override
                    public int compare(HandlerItem<HandlerContext> item1,
                                       HandlerItem<HandlerContext> item2) {
                        if (item1 == null)
                            return 1;
                        if (item2 == null)
                            return -1;
                        if (item1.getExecOrder() == item2.getExecOrder())
                            return 0;
                        return item1.getExecOrder().compareTo(
                                item2.getExecOrder());
                    }
                });

        return handlerItems;
    }


    @Override
    public boolean handle(HandlerContext context) {
        // 通过filter获取要执行的HandlerItem的集合
        LinkedList<HandlerItem<HandlerContext>> handlerItems = handlerFilter
                .doFilter(context, this.getHandlerItemMap());

        if (CollectionUtils.isEmpty(handlerItems)) {
            return true;
        }

        // 排序
        sortItems(handlerItems);

        // 执行
        Iterator<HandlerItem<HandlerContext>> items = handlerItems.iterator();
        while (items.hasNext()) {
            HandlerItem<HandlerContext> item = items.next();
            boolean ret = item.execute(context);
            if (!ret) {
                return ret;
            }
        }

        return true;
    }



    public Map<String, HandlerItem<HandlerContext>> getHandlerItemMap() {
        return handlerItemMap;
    }

    public void setHandlerItemMap(
            Map<String, HandlerItem<HandlerContext>> handlerItemMap) {
        this.handlerItemMap = handlerItemMap;
    }

    public HandlerFilter getHandlerFilter() {
        return handlerFilter;
    }


    public void setHandlerFilter(HandlerFilter handlerFilter) {
        this.handlerFilter = handlerFilter;
    }
}
