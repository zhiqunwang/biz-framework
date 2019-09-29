package org.elvis.wang.framework.api.dto;


import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;


import java.io.Serializable;

/**
 * Created by zhiqun.wang on 2019/6/27 07:52
 */
@Setter
@Getter
public class Response<T> implements Serializable {

    private boolean success;

    private String errorCode;

    private String errorMessage;

    private T data;

    public boolean isSuccess() {
        if(StringUtils.isEmpty(errorCode)){
            return true;
        }else{
            return false;
        }
    }

    public Response(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;

    }

    public Response(){
        super();
    }

}
