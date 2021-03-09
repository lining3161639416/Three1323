import com.db.mapper.UserMapper;
import com.db.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class A {
    private UserMapper userMapper;
    private SqlSession sqlSession;
    @Before
    public void before() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MyBatis.xml"));
        sqlSession = sqlSessionFactory.openSession(true);
         userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @After
    public void after(){
        sqlSession.close();
    }
    @Test
    public void test(){
        List<User> all = userMapper.findAll();
        all.forEach(e-> System.out.println(e));
    }
    @Test
    public void test1(){
        User user = userMapper.findUser("111");
        System.out.println(user);
    }
    @Test
    public void test2(){
        User user=new User();
        user.setUsername("张三1");
        user.setPassword("111");
        userMapper.saveUser(user);
        System.out.println(user);


    }
    @Test
    public void test3(){
        userMapper.updateUser(4,"小组指");
    }
    @Test
    public void test4(){
        Map<String,Object> map = new HashMap<>();
        map.put("ui", 1);
        map.put("un", "大头贴");
        userMapper.updateUserMap(map);
    }
    @Test
    public void test5(){
        List<User> users = userMapper.searchUser("2");
        System.out.println(users);
    }

    @Test
    public void test6(){
        userMapper.deleteUser(1);
    }







}
