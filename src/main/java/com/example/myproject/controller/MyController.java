package com.example.myproject.controller;

/**
 * @Description TODO
 * @Author lijin
 * @Date 2019/8/26 10:56
 * @Version 1.0
 **/

import com.example.myproject.domin.MyData;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.List;


@RestController
public class MyController {


    @GetMapping("/hello")
    public String testA(String str){

        try {
            WebSocketServer.sendInfo("haha"+new Date(),"001");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "xixi";
    }


}
