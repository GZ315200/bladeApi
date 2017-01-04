package org.drill.service;

import org.drill.model.vo.ActiveUser;

/**
 * Created by gygesM on 2016/12/12.
 */
public interface LoginService {

    /**
     * 根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
     * @param userCode
     * @param password
     * @return
     * @throws Exception
     */
    public ActiveUser authenticate(String userCode, String password) throws Exception;


}
