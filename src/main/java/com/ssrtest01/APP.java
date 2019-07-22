package com.ssrtest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan("com.ssrtest01.member.controller")
@SpringBootApplication
public class APP {
    public static void main(String[] args) {
        //第一种启动方式：@EnableAutoConfiguration 作用：自动配置。去检查pom文件里有哪些配置信息，然后去自动配置（如检查到Tomcat的配置文件则会自动去创建Tomcat服务器）。
        //                @EnableAutoConfiguration：扫包范围，默认在当前类里面
        //第二种启动方式：@ComponentScan("com.ssrtest01.member.controller")
        //第三种启动方法：@SpringBootApplication 等于 @EnableAutoConfiguration + @ComponentScan（）同级包（包含子包和当前包）
        //整个程序的入口，启动springboot项目,创建内置Tomcat服务器，使用Tomcat加载SpringMVC注解启动类
        SpringApplication.run(APP.class,args);
    }

}
