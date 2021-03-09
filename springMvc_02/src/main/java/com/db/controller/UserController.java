package com.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("usercontroller")
public class UserController {
    @RequestMapping("show")
    public String show(){
        System.out.println("010101");
//        System.out.println(1/0);
        return "index";
    }
}
