package org.drill.dao;

import org.apache.ibatis.annotations.Mapper;
import org.drill.module.po.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gygesM on 2016/11/25.
 * 角色dao实现
 */
@Repository
public interface RoleDao {

    /**
     * 得到所有角色列表
     * @return
     */
    public List<Role> getAll();

    /**
     * 通过名称查找角色信息
     * @param role
     * @return
     */
    public Role getByName(Role role);

    /**
     * 维护角色与资源权限关系
     * @param role
     * @return
     */
    public int deleteRoleMenu(Role role);
    public int insertRoleMenu(Role role);

    /**
     * 维护角色与公司部门关系
     * @param role
     * @return
     */
    public int deleteRoleOffice(Role role);
    public int insertRoleOffice(Role role);
}
