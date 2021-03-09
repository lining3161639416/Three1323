import com.db.mapper.AccountMapper;
import com.db.mapper.UserMapper;
import com.db.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class A {
    private SqlSession sqlSession;
    private UserMapper userMapper;
    private AccountMapper mapper;
    @Before
    public void before() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MyBatis.xml"));
        sqlSession = sqlSessionFactory.openSession(true);
        userMapper = sqlSession.getMapper(UserMapper.class);
         mapper = sqlSession.getMapper(AccountMapper.class);
    }
    @After
    public void after(){
        sqlSession.close();
    }
    @Test
    public void test(){
        List<Map> all = userMapper.findAll();
        all.forEach(e-> System.out.println(e));
    }
    @Test
    public void test1(){
        List<User> all1 = userMapper.findAll1();
        all1.forEach(e-> System.out.println(e));

    }




}
