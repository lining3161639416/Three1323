package com.db.mapper;

import com.db.model.Role;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    Role findRoleById(Integer id);

}