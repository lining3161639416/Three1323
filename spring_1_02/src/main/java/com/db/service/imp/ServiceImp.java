package com.db.service.imp;

import com.db.dao.Dao;
import com.db.dao.imp.DaoImp;
import com.db.service.Service;

public class ServiceImp implements  Service {
    private Dao dao=new DaoImp();

    @Override
    public void show() {
        dao.show();
        System.out.println("serviceimp");
    }
}
