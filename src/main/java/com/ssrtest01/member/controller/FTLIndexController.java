package com.ssrtest01.member.controller;

import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 整合freemarker视图层
 * 作者：荣杉山
 */

@Controller
public class FTLIndexController {

    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String,Object> map){
        map.put("name","####杉山真帅#####");
        map.put("age","22");
        map.put("sex","1");
        map.put("like","women");
        List<String> userlist=new ArrayList<String>();
        userlist.add("郝殷晨");
        userlist.add("张三");
        userlist.add("李四");
        map.put("userlist",userlist);
        return "ftlIndex";
    }
}
