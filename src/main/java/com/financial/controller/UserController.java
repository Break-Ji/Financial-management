package com.financial.controller;

import com.financial.entity.User;
import com.financial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getNameById", method = RequestMethod.GET)
    public User getNameById(User user)
    {
        user = new User();
        user.setUserId(1);
        return userService.getNameById(user);
    }
}
