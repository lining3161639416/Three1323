package com.db.dao.imp;

import com.db.dao.UserDao;
import com.db.model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class UserDaoImp implements UserDao {
    private JdbcTemplate jt;

    public UserDaoImp(JdbcTemplate jt) {
        this.jt = jt;
    }

    @Override
    public List<User> ListAll() {
        String sql="select * from user";
        return jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public void delUser(Integer id) {
        String sql="delete from user where id=?";
        System.out.println(jt.update(sql, id));
    }

    @Override
    public void rogatoryUser(Integer id) {
        String sql="select * from user where id=?";
        System.out.println(jt.query(sql,new BeanPropertyRowMapper<User>(User.class),id));
    }

    @Override
    public void updataUser(Integer id) {
        Scanner s=new Scanner(System.in);
        System.out.println("输入用户名：");
        String username = s.nextLine();
        System.out.println("输入密码：");
        String password = s.nextLine();
        String sql="update user set username=?,password=? where id=?";
        System.out.println( jt.query(sql,new BeanPropertyRowMapper<User>(User.class),username,password,id));
    }

    @Override
    public void addUser(User user) {
        String sql="insert into user values ?,?,?";
        System.out.println(jt.update(sql,user.getId(),user.getUsername(),user.getPassword()));
    }
}
