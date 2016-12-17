package org.drill.model.vo;

import java.io.Serializable;

/**
 * Created by gygesM on 2016/12/12.
 */
public class ActiveUser  implements Serializable{

    private String userId;
    private String userCode;
    private String username;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
