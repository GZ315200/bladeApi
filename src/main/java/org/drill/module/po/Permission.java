package org.drill.module.po;

import java.io.Serializable;

/**
 * Created by gygesM on 2016/12/1.
 */
public class Permission implements Serializable {

    private Integer id;
    private String name;
    private String type;
    private String url;
    private String percode;
    private Integer parentId;
    private String  parentIds;
    private Integer sortString;
    private String available;//(0:不可用，1：可用)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSortString() {
        return sortString;
    }

    public void setSortString(Integer sortString) {
        this.sortString = sortString;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }
}
