package org.drill.service.impl;

import org.drill.dao.UserDao;
import org.drill.module.po.User;
import org.drill.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gygesM on 2016/11/28.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findUserById(Integer id) {
       return userDao.getById(id);
    }

    @Override
    public User findUserByLoginName(String loginName) {
        return null;
    }
}
