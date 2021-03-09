package com.db.controller;

import com.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;
    public  void trans(){
        try {
            userService.toString();
            userService.trans("大陆和","xtt", 200.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
