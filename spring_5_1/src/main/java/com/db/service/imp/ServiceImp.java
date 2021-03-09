package com.db.service.imp;


import com.db.Utils.TransactionManager;
import com.db.dao.Dao;
import com.db.dao.imp.DaoImp;
import com.db.model.Account;
import com.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public  class ServiceImp implements UserService {
    @Autowired
    private Dao dao;
    @Autowired
    private TransactionManager transactionManager;
    @Override
    public void trans(String username1, String username2, Double i) throws Exception {
//        try {
////            transactionManager.start();
//            Account account = dao.findMoney(username1);
//            if(account.getBalance() >= i){
//                account.setBalance(account.getBalance()-i);
//                dao.updata(account);
//            }
//            System.out.println(1/0);
//            Account account1 = dao.findMoney(username2);
//            account1.setBalance(account1.getBalance()+i);
//            dao.updata(account1);
////            transactionManager.commit();
//        } catch (Exception e) {
////            transactionManager.rollBack();
//            e.printStackTrace();
//        }
        Account account = dao.findMoney(username1);
        if(account.getBalance() >= i){
            account.setBalance(account.getBalance()-i);
            dao.updata(account);
        }
//        System.out.println(1/0);
        Account account1 = dao.findMoney(username2);
        account1.setBalance(account1.getBalance()+i);
        dao.updata(account1);
    }
}
