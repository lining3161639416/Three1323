import com.db.mapper.RoleMapper;
import com.db.mapper.UserMapper;
import com.db.mapper.UserRoleMapper;
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
    private UserRoleMapper userRoleMapper;
    private RoleMapper roleMapper;
    @Before
    public void before() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("MyBatis.xml"));
        sqlSession = sqlSessionFactory.openSession(true);
        userMapper = sqlSession.getMapper(UserMapper.class);
        userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
        roleMapper = sqlSession.getMapper(RoleMapper.class);
    }
    @After
    public void after(){
        sqlSession.close();
    }
//    @Test
//    public void test() throws IOException, Exception {
//        List<String> warnings = new ArrayList<String>();
//        boolean overwrite = true;
//        File configFile =new File(this.getClass().getResource("/mybatis-generator.xml").getFile());
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(configFile);
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        myBatisGenerator.generate(null);
//    }
    @Test
    public void test(){
        List<Map> all = userMapper.findAll();
        all.forEach(e-> System.out.println(e));
    }
    @Test
    public void test1(){
        List<User> users = userMapper.findUsers();
        users.stream().forEach(e-> System.out.println(e.toString()));
    }
    @Test
    public void test2(){
        List<User> usersById = userMapper.findUsersById(1);
        usersById.forEach(e-> System.out.println(e));

    }






}
