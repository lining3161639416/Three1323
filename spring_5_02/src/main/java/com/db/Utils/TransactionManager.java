package com.db.Utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("transactionManager")
public class TransactionManager {
    @Autowired
    private ConnectionUtil connectionUtil;
    public void start() throws Exception {
        System.out.println("Start");
        connectionUtil.getConnection().setAutoCommit(false);
    }
    public  void  rollBack() throws Exception {
        System.out.println("roll");
        connectionUtil.getConnection().rollback();
    }
    public void commit() throws Exception {
        System.out.println("commit");
        connectionUtil.getConnection().commit();
    }
    public void around(ProceedingJoinPoint pj){
        try {
            start();
            pj.proceed(pj.getArgs());
            commit();
        } catch (Throwable throwable) {
            try {
                rollBack();
            } catch (Exception e) {
                e.printStackTrace();
            }
            throwable.printStackTrace();
        } finally {
            try {
                close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public void close() throws Exception {
        System.out.println("close");
        connectionUtil.getConnection().close();
        connectionUtil.close();
    }
}
