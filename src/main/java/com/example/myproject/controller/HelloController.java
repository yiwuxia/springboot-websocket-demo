package com.example.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description TODO
 * @Author lijin
 * @Date 2019/9/4 10:59
 * @Version 1.0
 **/
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("coming......");
        return "page/index.html";
    }


}
