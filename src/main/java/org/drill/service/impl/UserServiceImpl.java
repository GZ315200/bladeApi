package org.drill.service.impl;

import org.drill.common.exception.system.ServiceException;
import org.drill.common.exception.system.ServiceExceptionEnums;
import org.drill.dao.UserMapper;
import org.drill.model.po.User;
import org.drill.model.po.UserExample;
import org.drill.model.vo.ActiveUser;
import org.drill.service.UserService;
import org.drill.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
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
    private UserMapper userMapper;


    @Override
    public ActiveUser authenticate(String userCode, String password) throws Exception {

        return null;
    }
}