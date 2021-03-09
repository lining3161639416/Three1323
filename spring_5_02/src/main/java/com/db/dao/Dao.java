package com.db.dao;

import com.db.model.Account;

public interface Dao {
    Account findMoney(String username1) throws Exception;

    void updata(Account account) throws Exception;
}
