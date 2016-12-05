package org.drill.module.enums;

/**
 * Created by gygesM on 2016/11/24.
 * 机构类型
 */
public enum OrgType {

    COMPANY("公司", "1"),
    DEPARTMENT("部门", "2"),
    GROUP("小组", "3");


    private String type;
    private String no;

    OrgType(String type, String no) {
        this.type = type;
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
