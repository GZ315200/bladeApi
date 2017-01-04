package org.drill.service.impl;

import org.drill.common.exception.system.ServiceException;
import org.drill.common.exception.system.ServiceExceptionEnums;
import org.drill.dao.UserMapper;
import org.drill.model.po.User;
import org.drill.model.po.UserExample;
import org.drill.model.vo.ActiveUser;
import org.drill.service.LoginService;
import org.drill.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by gygesM on 2016/12/12.
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public ActiveUser authenticate(String userCode, String password) throws Exception {
        //用户验证
        UserExample example = new UserExample();
        example.createCriteria().andUsercodeEqualTo(userCode);
        List<User> userList = userMapper.selectByExample(example);
        if(null == userList || userList.size() == 0){
            throw new ServiceException(ServiceExceptionEnums.USERCODE_NOT_EXIST
                    ,ServiceExceptionEnums.USERCODE_NOT_EXIST.getMessage());
        }
            //密码验证
            String salt = userList.get(0).getSalt();
            String new_password = MD5.MD5(password, salt);
            String userPassword = userList.get(0).getPassword();
            if (!userPassword.equalsIgnoreCase(new_password)) {
                throw new ServiceException(ServiceExceptionEnums.PASSWORD_NOT_CORRECT
                        , ServiceExceptionEnums.PASSWORD_NOT_CORRECT.getMessage());
            }
            ActiveUser user = new ActiveUser();
            user.setUserCode(userCode);
            user.setUsername(userList.get(0).getUsername());
            user.setUserId(userList.get(0).getId());
            return user;
        }
    }
