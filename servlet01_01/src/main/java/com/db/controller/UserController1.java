package com.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("demo3")
public class UserController1 {
    @RequestMapping("show1")
    public void show1(Date birthday){
        System.out.println("22222");
        System.out.println(birthday);
    }
}
