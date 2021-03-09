package com.db.controller;

import com.sun.xml.internal.bind.util.Which;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("dom8")
public class UserController {
//    @RequestMapping("show")
//    public  void show(@RequestParam("userid") String id){
//        System.out.println(id);
//    }
    @RequestMapping(value = {"show/{userid}","show"},method = RequestMethod.GET)
    public  void show(@PathVariable(required = false,value = "userid") String id,@RequestHeader(value = "token") String token){
    System.out.println(id);
        System.out.println(token);
}
    @RequestMapping(value = "show/{userid}",method = RequestMethod.POST)
    public  void show(){
        System.out.println(1);
    }
}
