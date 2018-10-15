package com.financial.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloWorld")
@Api(tags ="HelloWorld相关接口集合")
public class HelloWorldController {

    @ApiOperation(value = "HelloWorld", notes = "HelloWorld")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }
}
