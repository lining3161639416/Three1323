package com.db.mapper;

import com.db.model.User;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    List<Map> findAll();
    List<User> findUsersById(Integer id);
    List<User> findUsers();
}