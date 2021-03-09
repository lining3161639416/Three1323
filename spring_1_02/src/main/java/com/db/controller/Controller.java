package com.db.controller;

import com.db.Utils.BeanFactyory;
import com.db.service.Service;
import com.db.service.imp.ServiceImp;

public class Controller {
    private static Service er= (Service) BeanFactyory.getBean("service");

    public static void main(String[] args) {
        er.show();
    }

}
