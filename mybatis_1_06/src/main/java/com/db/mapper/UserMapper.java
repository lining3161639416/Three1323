package com.db.mapper;

import com.db.model.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
}
