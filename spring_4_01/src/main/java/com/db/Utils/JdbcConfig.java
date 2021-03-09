package com.db.Utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mysql.fabric.xmlrpc.base.Value;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Properties;
public class JdbcConfig {
    @Bean
    public QueryRunner createQueryRunner(@Qualifier(value ="getDatasource") DataSource ds){
        QueryRunner queryRunner = new QueryRunner(ds);
        return queryRunner;
    }
    @Bean
    public  DataSource getDatasource(JdbcProperties jp){
        DruidDataSource ds=new DruidDataSource();
        ds.setUrl(jp.getUrl());
        ds.setUsername(jp.getUsername());
        ds.setPassword(jp.getPassword());
        ds.setDriverClassName(jp.getDriver());
        return ds;
    }
}
