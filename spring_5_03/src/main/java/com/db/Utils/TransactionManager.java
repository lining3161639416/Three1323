package com.db.Utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("transactionManager")
@Aspect
public class TransactionManager {
    @Autowired
    private ConnectionUtil connectionUtil;
    @Pointcut("execution(public void com.db.service.imp.ServiceImp.trans(..))")
    public  void pt1(){

    }
//    @Before("pt1()")
    public void start() throws Exception {
        System.out.println("Start");
        connectionUtil.getConnection().setAutoCommit(false);
    }
//    @AfterReturning("pt1()")
    public void commit() throws Exception {
        System.out.println("commit");
        connectionUtil.getConnection().commit();
    }
//    @AfterThrowing("pt1()")
    public  void  rollBack() throws Exception {
        System.out.println("roll");
        connectionUtil.getConnection().rollback();
    }
    @Around("pt1()")
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
//    @After("pt1()")
    public void close() throws Exception {
        System.out.println("close");
        connectionUtil.getConnection().close();
        connectionUtil.close();
    }
}
