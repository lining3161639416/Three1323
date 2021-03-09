package com.db.service.imp;

import com.db.dao.imp.DaoImp;
import com.db.service.Service;

public class ServiceImp implements Service {
    private DaoImp daoImp;
    private String username;

    public ServiceImp(DaoImp daoImp) {
        this.daoImp = daoImp;
    }

    //    public ServiceImp() {
//        System.out.println("执行");
//    }
//    public void init(){
//        System.out.println("init.....");
//    }
//    @Override
//    public void show() {
//        System.out.println("serviceImp............");
//    }
//    public  void destory(){
//        System.out.println("destory...");
//    }
//有参构造器
//    public ServiceImp(String username) {
//        this.username = username;
//    }
//
//    @Override
//    public void show() {
//        System.out.println(username);
//        System.out.println("1111111");
//    }
    //工厂方式
    @Override
    public void show() {
        System.out.println("2222");
        daoImp.show();
    }
}
