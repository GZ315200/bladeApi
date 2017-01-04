package org.drill.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * Created by GygesM on 2017/1/2.
 *
 */
public class WorkTimeInterceptor extends HandlerInterceptorAdapter {

    private int openingTime;
    private int closingTime;


    public void setOpeningTime(int openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        boolean url = request.getRequestURI().contains("/login");
        if (hour < openingTime || hour > closingTime && url){
            response.sendRedirect("/forbidden.html");
            return false;
        }
       return true;
    }

}
