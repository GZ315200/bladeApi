package org.drill.controller;

import org.drill.module.po.User;
import org.drill.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by gygesM on 2016/11/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/search",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public User selectUserResult(@RequestParam(name = "id") String id) {
        int i = Integer.parseInt(id);
        return userService.findUserById(i);
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getResult(){
        return "hello,world";
    }
}
