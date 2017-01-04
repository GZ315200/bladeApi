package org.drill.controller.common;

import org.drill.model.vo.ActiveUser;
import org.drill.service.LoginService;
import org.drill.utils.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by gygesM on 2016/12/12.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public ActiveUser loginByUserCode(@RequestParam String userCode,
                                      @RequestParam String password,
                                      HttpSession session,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        ActiveUser activeUser = loginService.authenticate(userCode,password);
//        CookieUtils.setCookie(response,"userCode",userCode);
        session.setAttribute("activeUser",activeUser);
        return activeUser;
    }
    
    
    
}
