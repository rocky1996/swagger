package com.acat.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/swagger-ui.html
 */

@RestController
@RequestMapping("/le")
@Api(value = "测试的demo",tags = {"搭建环境的测试代码"})
public class DemoController {

    @ApiOperation(value = "测试result",notes = "测试工程")
    @ApiImplicitParam(value = "姓名",name = "name")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(String name){
        return name;
    }

    @ApiOperation(value = "测试数据库连通性",notes = "测试数据库连通性")
    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public Object getAll(){
        return "getAll";
    }

}
