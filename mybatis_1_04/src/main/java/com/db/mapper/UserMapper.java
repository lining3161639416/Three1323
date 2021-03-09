package com.db.mapper;

import com.db.model.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<Map> findAll();
    List<User> findAll1();
}
