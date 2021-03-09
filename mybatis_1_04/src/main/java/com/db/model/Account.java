package com.db.model;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    private Integer id;
    private Double balance;
    private Integer uid;
}
