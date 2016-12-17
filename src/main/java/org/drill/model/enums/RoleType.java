package org.drill.model.enums;

/**
 * Created by gygesM on 2016/11/24.
 * 权限类型
 */
public enum RoleType {

    VIEW("查看数据", "view"),
    ADD("增加数据", "add"),
    DELETE("删除数据", "delete"),
    UPDATE("更改数据", "update"),
    EDIT("编辑","edit");

    private String type;
    private String name;

    RoleType(String type, String name) {
        this.type = type;
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
