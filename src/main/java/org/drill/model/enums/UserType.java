package org.drill.model.enums;

/**
 * Created by gygesM on 2016/11/24.
 * 用户类型
 */
public enum  UserType {

    SYSTEM_MANAGER("系统管理员","1"),
    DEPARTMENT_MANAGER("部门管理员","2"),
    GENERAL_MANAGER("普通用户","3"),
    GUEST("游客","4");

    private String type;
    private String no;

    UserType(String type, String no) {
        this.type = type;
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
