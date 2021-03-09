package com.db.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private Boolean status;

    private Date updateTime;

    private Date createTime;
    private List<UserRole> userRoles;


    private static final long serialVersionUID = 1L;


}