package com.db.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class ConnectionUtil {
    private static final ThreadLocal<Connection> THREAD_LOCAL=new ThreadLocal<>();
    @Autowired
    private DataSource dataSource;
    public Connection getConnection() throws Exception {
        if(THREAD_LOCAL.get() == null){
            THREAD_LOCAL.set(dataSource.getConnection());
        }
        return THREAD_LOCAL.get();
    }
    public void close(){
        if(THREAD_LOCAL.get() != null){
            THREAD_LOCAL.remove();
        }
    }
}
