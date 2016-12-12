package org.drill.controller;

import org.drill.common.exception.system.ServiceException;
import org.drill.common.exception.system.ServiceExceptionEnums;
import org.drill.model.po.User;
import org.drill.model.vo.ActiveUser;
import org.drill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by gygesM on 2016/11/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    final
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ActiveUser selectUserResult(@RequestParam String userCode,
                                   @RequestParam String password,
                                   HttpSession httpSession) throws Exception {
        ActiveUser activeUser = userService.authenticate(userCode, password);
        httpSession.setAttribute("activeUser", activeUser);
        return activeUser;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getResult() {
        return "hello,world";
    }
}
