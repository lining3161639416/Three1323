package com.db.Utils;

import com.db.service.imp.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserServiceProxyFactory {
//    @Autowired
//    @Qualifier("userService")
//    private UserService userService;
    @Autowired
    private TransactionManager transactionManager;
//    public UserService getUserServiceProxy(){
//        return (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                Object invoke = null;
//                try {
//                    //开启事物
//                    transactionManager.start();
//                     invoke = method.invoke(userService, args);
//                    transactionManager.commit();
//                }catch (Exception e){
//                    e.printStackTrace();
//                    transactionManager.rollBack();
//                }finally {
//                    transactionManager.close();
//                }
//                return invoke;
//            }
//        });
//    }
    @Autowired
    @Qualifier("userService")
    private ServiceImp serviceImp;
    private int i=0;
    public ServiceImp getUserServiceProxy(){
        return (ServiceImp) Enhancer.create(serviceImp.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object invoke=null;
                 i=i+1;
                try {
                    transactionManager.start();
                    invoke = method.invoke(serviceImp, objects);
                    System.out.println(invoke+":"+(i));
                    transactionManager.commit();
                } catch (Exception e) {
                    transactionManager.rollBack();
                    e.printStackTrace();
                } finally {
                    transactionManager.close();
                }
                return invoke;
            }
        });
    }
}
