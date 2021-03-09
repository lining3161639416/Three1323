package com.db.mapper;

import com.db.domain.Account;

import java.util.List;

/**
 * @author mt
 * @create 2021-01-06 10:55
 * 想明白一万遍，不如动手做一遍
 */
public interface AccountMapper {
    List<Account> findAllUser();
}
