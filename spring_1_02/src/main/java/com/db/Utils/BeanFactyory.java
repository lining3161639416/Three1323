package com.db.Utils;

import com.db.service.Service;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactyory {
    public static  Object getBean(String beanName) {
        try {
            InputStream is = BeanFactyory.class.getClassLoader().getResourceAsStream("bean.properties");
            Properties p = new Properties();
            p.load(is);
            String fullName = p.getProperty(beanName);
            return Class.forName(fullName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
//    public static void main(String[] args){
//        Service bean = (Service) getBean("service");
//        bean.show();
//    }
  
}
