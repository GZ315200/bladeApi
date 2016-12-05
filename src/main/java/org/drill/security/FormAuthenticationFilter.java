package org.drill.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.web.util.WebUtils;
import org.drill.common.exception.system.ServiceExceptionEnums;
import org.drill.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by gygesM on 2016/11/23.
 * 表单验证（包含验证码）过滤类
 * @author gygesM
 * @version 2016/11/23
 * @see org.apache.shiro.web.filter.authc.FormAuthenticationFilter
 */
@Service(value = "formAuthenticationFilter")
public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {

    private static final Logger log = LoggerFactory.getLogger(FormAuthenticationFilter.class);

    private static final String DEFAULT_CAPTCHA_PARAM = "validateCode";
    private static final String DEFAULT_MESSAGE_PARAM = "message";

    private String captchaParam = DEFAULT_CAPTCHA_PARAM;
    private String messageParam = DEFAULT_MESSAGE_PARAM;

    /**
     * 保留空构造方法
     */
    public FormAuthenticationFilter() {
        super();
        setCaptchaParam(DEFAULT_CAPTCHA_PARAM);
        setMessageParam(DEFAULT_MESSAGE_PARAM);
    }

    public FormAuthenticationFilter(String captchaParam, String messageParam) {
        super();
        this.captchaParam = captchaParam;
        this.messageParam = messageParam;
    }

    /**
     * 执行身份认证，创建认证信息
     * @param request
     * @param response
     * @return
     */
    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String username = getUsername(request);
        String password = getPassword(request);
        if (password == null) {
            password = "";
        }
//        记住我
        boolean rememberMe = isRememberMe(request);
//        获取主机ip
        String host = StringUtils.getRemoteAddr((HttpServletRequest) request);
//        获取验证码
        String captcha = getCaptchaParam();
        return new UsernamePasswordToken(username,password.toCharArray(),rememberMe,host,captcha);
    }

    public String getCaptchaParam() {
        return captchaParam;
    }

    public void setCaptchaParam(String captchaParam) {
        this.captchaParam = captchaParam;
    }

    public String getMessageParam() {
        return messageParam;
    }

    public void setMessageParam(String messageParam) {
        this.messageParam = messageParam;
    }

    /**
     *调用成功后返回的url
     * @return
     */
    public String getSuccessfulUrl(){
        return super.getSuccessUrl();
    }

    /**
     *调用成功后返回的url
     * @param request
     * @param response
     * @throws Exception
     */
    @Override
    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
        WebUtils.issueRedirect(request,response,getSuccessfulUrl(),null,true);
    }

    /**
     * 登录失败 调用事件
     * @param token 验证令牌
     * @param e 异常信息
     * @param request
     * @param response
     * @return
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        String className = e.getClass().getName(),message = "";
//   账号密码不正确
        if (IncorrectCredentialsException.class.getName().equals(className)
                || UnknownAccountException.class.getName().equals(className)){
            message = ServiceExceptionEnums.USERNAME_OR_PASSWORD_IS_NOT_CORRECT.getMessage();
//            输出信息不为空
        }else if(e.getMessage() != null && StringUtils.startsWith(e.getMessage(),"msg:")){
            message = StringUtils.replace(e.getMessage(),"msg:","");
//            其它为系统内部错误
        }else {
            message = ServiceExceptionEnums.SYSTEM_ERROR.getMessage();
            e.printStackTrace();//打印出控制台
        }
//        封装错误信息
        request.setAttribute(getFailureKeyAttribute(),className);
        request.setAttribute(getMessageParam(),message);
        return true;
    }
}
