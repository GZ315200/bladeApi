//package org.drill.system.security;
//
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.AuthenticationInfo;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * Created by gygesM on 2016/11/23.
// * 系统授权领域实现类
// * @version 2016/11/23
// * @see AuthorizingRealm
// */
//@Service
//public class SystemAuthorizingRealm extends AuthorizingRealm{
//
//
//    /**
//     * 认证管理
//     * @param token
//     * @return
//     * @throws AuthenticationException
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//
//
//
//        return null;
//    }
//
//
//
//
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    /**
//     * 授权
//     * @param principals
//     * @return
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//
//        return null;
//    }
//
//}
