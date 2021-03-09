package com.db;

import com.db.Utils.JdbcConfig;
import com.db.Utils.JdbcProperties;
import com.db.model.User;
import com.db.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value = {"com.db"})
@Import({JdbcConfig.class, JdbcProperties.class})
public class BeansConfig {


}

