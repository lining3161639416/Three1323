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

public class A {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private UserMapper userMapper;

    @Before
    public void before() throws Exception {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MyBatis.xml"));
        sqlSession = sqlSessionFactory.openSession(true);
        userMapper = sqlSession.getMapper(UserMapper.class);

    }

    @After
    public void after() {
        sqlSession.close();
    }

    @Test
    public void test() {
        List<User> all = userMapper.findAll();
        all.forEach(e-> System.out.println(e));
        sqlSession.close();
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession1.getMapper(UserMapper.class);

        List<User> all1 = mapper.findAll();
        System.out.println(all1);
    }
}

