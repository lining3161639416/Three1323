package com.db.dao.imp;

import com.db.Utils.ConnectionUtil;
import com.db.dao.Dao;
import com.db.model.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoImp implements Dao {
    @Autowired
    private QueryRunner queryRunner;
    @Autowired
    private ConnectionUtil connectionUtil;
    @Override
    public Account findMoney(String username1) throws Exception {
        String sql="select * from account where username = ?";
        Account account = queryRunner.query(connectionUtil.getConnection(), sql, new BeanHandler<>(Account.class), username1);
        return account;
    }

    @Override
    public void updata(Account account) throws Exception {
        String sql="update account set balance=? where username=?";
        queryRunner.update(connectionUtil.getConnection(),sql,account.getBalance(),account.getUsername());
    }
}
