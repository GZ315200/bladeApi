import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

import static org.apache.hadoop.yarn.webapp.MimeType.JSON;

/**
 * Created by gygesM on 2016/11/21.
 * shiro控制权限流程
 */

public class TestResult {
    @Test
    public void getResult() throws IOException {
////        获取启动文件,此处使用 Ini 配置文件初始化 SecurityManager
//        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
////        得到 SecurityManager 实例 并绑定给 SecurityUtils
//        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
//        SecurityUtils.setSecurityManager(securityManager);
////      得到 Subject 及创建用户名/密码身份验证 Token（即用户身份/凭证）
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken("mazean","123");
//        try {
////            登录，即身份验证
//            subject.login(token);
//        }catch (AuthenticationException a){
//            a.printStackTrace();
//            System.err.println("认证失败");
//        }
//        Assert.assertEquals(true,subject.isAuthenticated());
//        System.out.println("认证成功");
////        subject.logout();
//        String s = "sdfsdfasdf";
//
//        byte[] o = s.getBytes("utf-8");
//        String ssss = new String(o,"utf-8");
//        System.out.println(ssss);
        OkHttpClient client = new OkHttpClient();
        String url = "http://localhost:8080/seimi/";
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        String result = response.body().string();
        if (response.isSuccessful()) {
            System.out.println(result);
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }
}


