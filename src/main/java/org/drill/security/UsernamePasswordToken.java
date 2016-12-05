package org.drill.security;


import org.springframework.stereotype.Service;

/**
 * Created by gygesM on 2016/11/23.
 * 用户名密码验证（验证码）
 * @author gygesM
 * @version 2016/11/23
 * @see org.apache.shiro.authc.UsernamePasswordToken
 */
@Service(value = "usernamePasswordToken")
public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken {

    private String captcha;

    /**
     * 保存空构造方法
     */
    public UsernamePasswordToken() {
        super();
    }

    /**
     * 登陆信息
     * @param username 用户名
     * @param password 密码
     * @param rememberMe 记住我
     * @param host 主机ip
     * @param captcha 验证码
     */
    public UsernamePasswordToken(String username, char[] password, boolean rememberMe,
                                 String host, String captcha) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
