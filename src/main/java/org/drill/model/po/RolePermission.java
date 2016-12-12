package org.drill.model.po;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RolePermission {
    private String id;

    private String txRoleId;

    private String txPermissionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTxRoleId() {
        return txRoleId;
    }

    public void setTxRoleId(String txRoleId) {
        this.txRoleId = txRoleId == null ? null : txRoleId.trim();
    }

    public String getTxPermissionId() {
        return txPermissionId;
    }

    public void setTxPermissionId(String txPermissionId) {
        this.txPermissionId = txPermissionId == null ? null : txPermissionId.trim();
    }
}