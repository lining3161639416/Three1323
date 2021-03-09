package com.db.dao.imp;

import com.db.dao.UserDao;
import com.db.model.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository("userDao")
public class UserDaoImp implements UserDao {
    @Autowired
    private QueryRunner queryRunner;
    @Override
    public void show() {
        List<User> list = null;
        try {
            System.out.println("UserDaoImp");
            String sql="select * from user";
            list = queryRunner.query(sql,new BeanListHandler<User>(User.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(list);
    }
}
