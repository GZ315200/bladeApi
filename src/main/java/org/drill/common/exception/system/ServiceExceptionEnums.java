package org.drill.common.exception.system;

/**
 * Created by gygesM on 2016/11/24.
 */
public enum ServiceExceptionEnums {

    USERNAME_OR_PASSWORD_IS_NOT_CORRECT("用户或密码错误, 请重试","100001"),
    SYSTEM_ERROR("系统错误，请稍后重试","100002");


    ServiceExceptionEnums(String message, String code) {
        this.message = message;
        this.code = code;
    }

    private String message;
    private String code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
