package com.db.mapper;

import com.db.model.Account;

import java.util.List;

public interface AccountMapper {
    List<Account> findAccout(Integer uid);
}
