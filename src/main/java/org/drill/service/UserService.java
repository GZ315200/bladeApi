package org.drill.service;

import org.drill.module.po.User;

import java.util.List;

/**
 * Created by gygesM on 2016/11/23.
 */
public interface UserService {

    /**
     * 查看所有用户列表
     * @return
     */
    public List<User> findAll();
    /**
     *
     * @param id
     * @return
     */
    public User findUserById(Integer id);

    /**
     *
     * @param loginName
     * @return
     */
    public User findUserByLoginName(String loginName);
}
