package com.financial.controller;

import com.financial.entity.User;
import com.financial.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Api(tags ="User相关接口集合")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据ID获得用户名称", notes = "根据ID获得用户名称userName")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "学生ID", paramType = "query", required = true, dataType = "Integer")
    })
    @ApiResponses({
        @ApiResponse(code=400,message="请求参数没填好"),
        @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "/getNameById", method = RequestMethod.GET)
    public User getNameById(@RequestParam Integer id)
    {
        User user = new User();
        user.setUserId(id);
        return userService.getNameById(user);
    }

    @ApiOperation(value = "根据条件获得用户", notes = "根据条件获得用户User")
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public User getUser(@RequestBody User user)
    {
        return userService.getNameById(user);
    }
}
