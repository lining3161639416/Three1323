package com.db.mapper;

import com.db.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> findAll();
    User findUser(String username);
    void saveUser(User user);

    void updateUser(@Param("userId") int id, @Param("username") String username);

    void updateUserMap(Map<String, Object> map);

    List<User> searchUser(String username);
    void deleteUser(Integer id);
}
