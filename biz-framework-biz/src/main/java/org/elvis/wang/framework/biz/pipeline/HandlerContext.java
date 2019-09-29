package org.elvis.wang.framework.biz.pipeline;


/**
 * Created by zhiqun.wang on 2019/6/26 23:02
 */
public interface HandlerContext {

    /**
     * 获取上线文参数
     *
     * @param name
     * @return
     */
    Object getProperty(String name);

    /**
     * 注册上下文参数
     *
     * @param name
     * @param value
     */
    void setProperty(String name, Object value);

    /**
     * 替换上下文
     *
     * @param name
     * @param value
     */
    void replaceProperty(String name, Object value);

    /**
     * 移除上下文参数
     *
     * @param name
     */
    void removeProperty(String name);

    /**
     * 移除上下文所有参数
     *
     */
    void removeAll();
}
