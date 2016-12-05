package org.drill.module.po;

import java.io.Serializable;

/**
 * Created by gygesM on 2016/12/1.
 */
public class Role implements Serializable{

    private String id;
    private String name;
    private String available;//(0:不可用，1：可用)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
