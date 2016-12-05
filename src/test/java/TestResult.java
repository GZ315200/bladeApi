import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gygesM on 2016/11/21.
 * shiro控制权限流程
 */

public class TestResult {
    @Test
    public void getResult(){
//        获取启动文件,此处使用 Ini 配置文件初始化 SecurityManager
        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
//        得到 SecurityManager 实例 并绑定给 SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
//      得到 Subject 及创建用户名/密码身份验证 Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("mazean","123");
        try {
//            登录，即身份验证
            subject.login(token);
        }catch (AuthenticationException a){
            a.printStackTrace();
            System.err.println("认证失败");
        }
        Assert.assertEquals(true,subject.isAuthenticated());
        System.out.println("认证成功");
        subject.logout();
    }
}
