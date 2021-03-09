package com.db.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionManager {
    @Autowired
    private ConnectionUtil connectionUtil;
    public void start() throws Exception {
//        System.out.println("Start");
        connectionUtil.getConnection().setAutoCommit(false);
    }
    public  void  rollBack() throws Exception {
//        System.out.println("roll");
        connectionUtil.getConnection().rollback();
    }
    public void commit() throws Exception {
//        System.out.println("commit");
        connectionUtil.getConnection().commit();
    }
    public void close() throws Exception {
//        System.out.println("jsu");
        connectionUtil.getConnection().close();
        connectionUtil.close();
    }
}
