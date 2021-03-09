package com.db.model;

import lombok.*;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer userId;
    private String  ename;
    private Integer jobId;
    private Integer mgr;
    private Date joindate;
    private Double salary;
    private Double bonus;
    private Integer  deptId;
}
