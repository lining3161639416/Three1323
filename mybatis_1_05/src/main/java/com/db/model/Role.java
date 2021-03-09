package com.db.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable {
    private Integer id;

    private String name;

    private Boolean status;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

}