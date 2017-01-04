package org.drill.controller;

import org.drill.model.vo.ActiveUser;
import org.drill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by gygesM on 2016/11/23.
 *
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
}
