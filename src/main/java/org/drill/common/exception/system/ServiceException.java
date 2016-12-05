package org.drill.common.exception.system;

import org.drill.common.exception.system.ServiceExceptionEnums;

/**
 * Created by gygesM on 2016/11/28.
 * 用于系统服务异常处理
 */
public class ServiceException extends RuntimeException {

    private ServiceExceptionEnums exceptionEnums;


    public ServiceException(){
        super();
    }

    public ServiceException(ServiceExceptionEnums exceptionEnums){
        this.exceptionEnums = exceptionEnums;
    }
    public ServiceException(ServiceExceptionEnums exceptionEnums,String message){
        super(message);
        this.exceptionEnums = exceptionEnums;
    }
    public ServiceExceptionEnums getExceptionEnums() {
        return exceptionEnums;
    }

    public void setExceptionEnums(ServiceExceptionEnums exceptionEnums) {
        this.exceptionEnums = exceptionEnums;
    }
}
