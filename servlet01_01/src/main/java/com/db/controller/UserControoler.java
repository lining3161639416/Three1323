package com.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vo.User;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("dom1")
public class UserControoler {
//   例一
//    @RequestMapping("show1")
//    public String show(String username,String password,Boolean gender,String likes){
//        System.out.println("111111111");
//        System.out.println(username+":"+password+":"+gender+":"+likes);
//        return "two";
//    }
//    例二
//@RequestMapping("show2")
//public String show(@RequestParam Map<String, Object> map, @RequestParam List<String> likes){
//    System.out.println(map);
//    System.out.println(likes);
//    return "two";
//}
//    例三
//@RequestMapping("show3")
//public String show(@RequestParam Map<String, Object> map){
//    System.out.println(map);
//    return "two";
//}
//    例四
//@RequestMapping("show4")
//public void show5(User user){
//    System.out.println(user);
//}
//    例五
//    @RequestMapping("show5")
//public void show5(String username){
//    System.out.println(username);
//}
//        例六
//@RequestMapping("show4")
//public void show5(@RequestBody Map data){
//    System.out.println(data);
//}
//@RequestMapping("show4")
//public void show4(@RequestBody String data){
//    System.out.println(data);
//}
//@RequestMapping("show5")
//public void show5(@RequestBody Map data){
//    System.out.println(data);
//}
//    例七
@RequestMapping("show")
public String show(String username){
    System.out.println("111111111");
    System.out.println(username);
    return "two";
}
//    例八

//    @RequestMapping(value = {"a", "b"}, params = {"token=100"}, headers = {"daben"})
//    public String show(@RequestParam("username") String name, @RequestHeader("daben") String daben) {
//        System.out.println(name);
//        System.out.println(daben);
//        System.out.println("demo1.........");
//        return "success";
//    }
}