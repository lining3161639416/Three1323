package com.db.mapper;

import com.db.model.UserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    List<UserRole> findUserRoleById(Integer uid);
}