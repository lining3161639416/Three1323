package com.db.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRole implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer roleId;

    private Date createTime;

    private Date updateTime;

    private Role role;
    private static final long serialVersionUID = 1L;


}