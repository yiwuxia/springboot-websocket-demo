package com.example.myproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description TODO
 * @Author lijin
 * @Date 2019/6/26 12:22
 * @Version 1.0
 **/



@SpringBootApplication
public class Example implements CommandLineRunner {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }



}
