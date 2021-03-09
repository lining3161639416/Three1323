import com.db.dao.UserDao;
import com.db.model.Emp;
import com.db.service.Service;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


public class A {
    private SqlSession sqlSession;
    private UserDao userDao;
    @Before
    public void before() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MyBatis.xml"));
         sqlSession = sqlSessionFactory.openSession(true);
         userDao = sqlSession.getMapper(UserDao.class);
    }
    @After
    public void after(){
        sqlSession.close();
    }
    @Test
    public void test() throws Exception {
        List<Emp> all = userDao.findAll();
        all.forEach(e-> System.out.println(e));
    }
    @Test
    public void test1(){
        List<Map<String, Object>> user = userDao.findUser();
        user.forEach(e-> System.out.println(e));
        System.out.println(user);
    }
    @Test
    public void test2(){
        Emp emp=new Emp();
        emp.setUserId(1);
        List<Emp> emps = userDao.searchUser(emp);
//        emps.forEach(e-> System.out.println(e));
        Stream<Emp> stream = emps.stream();
//        stream.forEach(e-> System.out.println(e));


    }





}
