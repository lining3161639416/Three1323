package com.db.controller;

import com.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("controller")
public class Controller {
    @Autowired
    private UserService userService;
    public  void  show(){
        System.out.println("1111");
        userService.show();
    }

}
