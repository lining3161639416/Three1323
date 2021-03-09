package com.db.mapper;

import com.db.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountMapperTest {
   @Test
   public void test() throws Exception {
       SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
       InputStream is = Resources.getResourceAsStream("MyBatis.xml");
       SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
       //使用工厂生产SqlSession
       SqlSession sqlSession = build.openSession();
       //使用SqlSession获取代理对象
       AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
       List<Account> accounts = mapper.findAllUser();
       accounts.forEach(e-> System.out.println(e));
       sqlSession.close();
   }


}
