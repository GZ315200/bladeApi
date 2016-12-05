package org.drill.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by gygesM on 2016/11/22.
 * 缓存工具
 */
public class CookieUtils {

    private final static Logger logger = LoggerFactory.getLogger(CookieUtils.class);

    /**
     * 设置cookie（生存时间为一天）
     * @param response 响应
     * @param name 名称
     * @param value 值
     */
    public static void setCookie(HttpServletResponse response,String name,String value){
        setCookie(response,name,value,60*24*60);
    }

    /**
     * 设置cookie 生存时间为一天，（设置客户端路径）
     * @param response 响应
     * @param name 名称
     * @param value 值
     * @param path 路径
     */
    public static void setCookie(HttpServletResponse response,String name,String value,String path){
        setCookie(response,name,value,path,60*24*60);
    }
    /**
     * 设置cookie （保存根目录下）
     * @param response  响应
     * @param name 名称
     * @param value 值
     * @param maxAge （生存时间）
     */
    private static void setCookie(HttpServletResponse response, String name, String value, int maxAge) {
        setCookie(response,name,value,"/",maxAge);
    }

    /**
     * 设置cookie
     * @param response 响应
     * @param name 名称
     * @param value 值
     * @param path 路径
     * @param maxAge 生存时间
     */
    public static void setCookie(HttpServletResponse response,String name,String value,String path,Integer maxAge) {
        Cookie cookie = null;
        try {
            cookie = new Cookie(name, null);
            cookie.setPath(path);//指定cookie的路径客户端应该返回cookie。
            cookie.setMaxAge(maxAge);//设置生存时间
            cookie.setValue(URLEncoder.encode(value, "utf-8"));
            response.addCookie(cookie);
        } catch (UnsupportedEncodingException e) {
            logger.info("不支持此加密参数"+ cookie.getValue() + e.getMessage());
            e.printStackTrace();
        }
    }
    /**
     * 获取指定cookie的值
     * @param request 请求
     * @param name 名称
     * @return getCookie(request,null,name,false);
     */
    public static String getCookie(HttpServletRequest request,String name){
        return getCookie(request,null,name,false);
    }

    /**
     * 获取cookie 并删除
     * @param request
     * @param response
     * @param name
     * @return
     */
    public static String getCookie(HttpServletRequest request,HttpServletResponse response,String name){
        return getCookie(request,response,name,true);
    }

    /**
     * 获取cookie
     * @param request 请求
     * @param response 响应
     * @param name 名称
     * @param isRemove 是否移除
     */
    public static String getCookie(HttpServletRequest request,HttpServletResponse response,String name, boolean isRemove){
        String value = null;
        Cookie[] cookie = request.getCookies();
        if (cookie != null){
            for (Cookie cookies : cookie){
                if (cookies.getName().equals(name)){
                    try {
                        value = URLDecoder.decode(cookies.getValue(),"utf-8");
                        if (isRemove){
                            cookies.setMaxAge(0);
                            response.addCookie(cookies);
                        }
                    } catch (UnsupportedEncodingException e) {
                        logger.info("不支持此加密参数"+ cookies.getValue() + e.getMessage());
                        e.printStackTrace();
                    }
                }
            }
        }
        return value;
    }
}
