package com.db.dao;

import com.db.model.User;

import java.util.List;

public interface UserDao {
    List<User> ListAll();
    void delUser(Integer id);
    void rogatoryUser(Integer id);
    void updataUser(Integer id);
    void addUser(User user);
}
