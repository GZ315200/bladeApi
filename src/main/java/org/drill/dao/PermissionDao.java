package org.drill.dao;

import org.drill.module.po.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gygesM on 2016/11/25.
 * 用户资源dao实现
 */
@Repository
public interface PermissionDao{
    /**
     * 根据父级id查找资源列表
     * @param
     * @return
     */
    public List<Permission> findByParentIdsLike(Permission permission);

    /**
     * 根据用户id查找资源列表
     * @param
     * @return
     */
    public List<Permission> findByUserId(Permission permission);

    /**
     * 更新父级id
     * @param
     * @return
     */
    public int updateParentIds();

    /**
     * 更新排序
     * @param
     * @return
     */
    public int updateSort();
}
