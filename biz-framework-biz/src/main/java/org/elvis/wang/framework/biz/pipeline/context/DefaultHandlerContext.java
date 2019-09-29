package org.elvis.wang.framework.biz.pipeline.context;

import org.elvis.wang.framework.biz.pipeline.HandlerContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhiqun.wang on 2019/6/29 22:25
 */
public class DefaultHandlerContext  implements HandlerContext {

    // 上下文信息容器
    private Map<String, Object> container;


    public DefaultHandlerContext(){
        container = new HashMap<>();
    }

    @Override
    public Object getProperty(String name) {
         return container.get(name);
    }

    @Override
    public void setProperty(String name, Object value) {
        container.put(name, value);
    }

    @Override
    public void replaceProperty(String name, Object value) {
        container.replace(name, value);
    }

    @Override
    public void removeProperty(String name) {
        if (container.containsKey(name)) {
            container.remove(name);
        }
    }

    @Override
    public void removeAll() {
        if (!container.isEmpty()) {
            container = new HashMap<String, Object>();
        }
    }
}
