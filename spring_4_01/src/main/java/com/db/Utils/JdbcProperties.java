package com.db.Utils;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:jdbc.properties")
public class JdbcProperties {
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private  String password;
    @Value("${db.url}")
    private String url;
    @Value("${db.driver}")
    private  String driver;


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getDriver() {
        System.out.println(url+username);
        return driver;
    }
}
