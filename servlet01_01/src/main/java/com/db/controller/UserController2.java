package com.db.controller;

import com.db.model.ResultModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("dom7")
public class UserController2 {
    @RequestMapping("show1")
//    @ResponseBody
//    public ResultModel show1(String username){
        // System.out.println(username+":"+password);
//        System.out.println(username);
//        ResultModel resultModel = new ResultModel();
//        resultModel.setMessage(username);
//        // resultModel.setCode(password);
//        return resultModel;
//    }
//    @ResponseBody
//    public ResultModel show1(@RequestParam Map map){
//        System.out.println(map);
//        ResultModel resultModel = new ResultModel();
//        return resultModel;
//    }
    @ResponseBody
    public ResultModel show1(@RequestBody String map){
        System.out.println(map);
        ResultModel resultModel = new ResultModel();
        return resultModel;
    }
}