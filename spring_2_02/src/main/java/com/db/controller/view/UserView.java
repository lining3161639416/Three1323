package com.db.controller.view;

import com.db.dao.imp.UserDaoImp;
import com.db.model.User;
import com.db.service.Service;
import com.db.service.imp.ServiceImp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class UserView {

    private  static Service service;

    public UserView(Service service) {
        this.service = service;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpa=new ClassPathXmlApplicationContext("beans.xml");
        service = (Service) cpa.getBean("userservice",ServiceImp.class);
        while (true){
            System.out.println("1.输出全部用户");
            System.out.println("2.根据id查询用户");
            System.out.println("3.根据id删除用户");
            System.out.println("4.根据id修改用户信息");
            System.out.println("5.添加用户");
            System.out.println("6.退出操作");
            System.out.println("请选择操作");
            Scanner scan=new Scanner(System.in);
            String s = scan.nextLine();
            switch (s){
                case "1":
                    UserView.service.list();
                    break;
                case "2":
                    //查询
                    UserView.service.rogatory();
                    break;
                case "3":
                    UserView.service.del();
                    break;
                case "4":
                    UserView.service.updata();
                    break;
                case"5":
                    UserView.service.add();
                    break;
                case"6":
                    return;
            }
        }
    }
}
