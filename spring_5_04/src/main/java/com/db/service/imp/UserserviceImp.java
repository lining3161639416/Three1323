package com.db.service.imp;

import com.db.dao.UserDao;
import com.db.dao.imp.UserDaoImp;
import com.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userserviceImp")
public class UserserviceImp implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void show() {
        System.out.println("2222");
        userDao.show();
    }
}
