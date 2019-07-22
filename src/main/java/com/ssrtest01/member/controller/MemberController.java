package com.ssrtest01.member.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot 2.0 第一个案例
 * SpringCloud依赖于springboot实现微服务。SpringCloud使用SpringMVC编写微服务http接口，
 * 所以springboot默认集成SpringMVC组件。 微服务的通讯接口：http协议+json格式
 * 作者：荣杉山
 * QQ：1019014178
 */
@RestController
public class MemberController {
    //@RestController注解 作用：表示该类中的所有方法返回json格式。@RestController=@Controller+@ResponseBody
    //@RestControllew 是springboot 提供的吗？答：不是。它很早就出现了，为的是为微服务提供json返回格式
    //springboot 的启动原理：通过SpringMVC注解方式启动。springboot内置http服务器（默认是Tomcat）

    @RequestMapping("/memberIndex")
    public String memberIndex(){
        return "荣杉山是个大帅哥";
    }


}
