package org.elvis.wang.framework.biz.pipeline.exception;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by zhiqun.wang on 2019/6/29 20:41
 * 业务异常
 */
@Setter
@Getter
public class BizException extends  RuntimeException {

    /** 返回码 */
    private String errorCode;
    /** 信息 */
    private String errorMessage;

    /**
     * 构造函数
     */
    public BizException() {
        super();
    }

    /**
     * 构造函数
     *
     * @param errorCode
     * @param message
     */
    public BizException(String errorCode, String message) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = message;
    }

}
