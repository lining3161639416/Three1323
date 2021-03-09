package com.db.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mt
 * @create 2021-01-06 10:50
 * 想明白一万遍，不如动手做一遍
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String username;
    private Double balance;
}
