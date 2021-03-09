package com.db.Utils;

import com.db.dao.imp.DaoImp;
import com.db.service.imp.ServiceImp;

public class BeansFactory {
//    public ServiceImp getservice(){
//
//        return new ServiceImp();
//    }
    public static DaoImp getDaoImp(){
        return new DaoImp();
    }
}
