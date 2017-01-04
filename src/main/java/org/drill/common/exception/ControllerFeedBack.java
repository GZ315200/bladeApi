package org.drill.common.exception;

/**
 * Created by gygesM on 2016/11/24.
 */
public enum ControllerFeedBack {

    QUERY_FAIL("查询失败","100001");

    private String codeDesc;
    private String code;

    ControllerFeedBack(String codeDesc, String code) {
        this.codeDesc = codeDesc;
        this.code = code;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
