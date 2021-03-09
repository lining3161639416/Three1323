package com.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("dom10")
public class UserController4 {
    @RequestMapping("show")
//    public String show(HttpServletRequest request){
//        request.setAttribute("username","信息");
//        System.out.println(11);
//        return "ajax/list";
//    }
//    public ModelAndView show(){
//        ModelAndView modelAndView =new ModelAndView();
//        modelAndView.addObject("username","信息");
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }
//    public String show( ModelMap modelMap){
//        modelMap.addAttribute("username","信息");
//        return "list";
//    }
    public String show( Map modelMap){
        modelMap.put("username","信息");
        return "list";
    }
}
