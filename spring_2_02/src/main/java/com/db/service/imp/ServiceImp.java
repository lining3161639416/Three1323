package com.db.service.imp;

import com.db.dao.UserDao;
import com.db.dao.imp.UserDaoImp;
import com.db.model.User;
import com.db.service.Service;

import java.util.List;
import java.util.Scanner;

public class ServiceImp implements Service {
    private UserDao userDao;

    public ServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void list() {
        List<User> list = userDao.ListAll();
        for(User user : list){
            System.out.println(user);
        }
    }

    @Override
    public void rogatory() {
        Scanner s=new Scanner(System.in);
        System.out.println("输入id:");
        int id = s.nextInt();
        userDao.rogatoryUser(id);
    }

    @Override
    public void del() {
        Scanner s=new Scanner(System.in);
        System.out.println("输入id:");
        int id = s.nextInt();
         userDao.delUser(id);
    }

    @Override
    public void updata() {
        Scanner s=new Scanner(System.in);
        System.out.println("输入id:");
        int id = s.nextInt();
         userDao.updataUser(id);
    }

    @Override
    public void add() {
        Scanner s=new Scanner(System.in);
        System.out.println("输入用户id：");
        int id = s.nextInt();
        System.out.println("输入用户名：");
        String username = s.nextLine();
        System.out.println("输入密码：");
        String password = s.nextLine();
        User user =  new User(id,username,password);
         userDao.addUser(user);
    }
}
