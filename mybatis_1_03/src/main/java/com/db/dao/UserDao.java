package com.db.dao;

import com.db.model.Emp;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<Emp> findAll();

    List<Map<String, Object>> findUser();

    List<Emp> searchUser(Emp u);
    List<Emp> searchUser1(Emp u);
    List<Emp> searchUser2(Emp u);
    List<Emp> searchUser3(Emp u);

    void updateUser(Emp u);

    List<Emp> findUserByIds(List<Integer> ids);

    long addUsers(List<Emp> users);
}
