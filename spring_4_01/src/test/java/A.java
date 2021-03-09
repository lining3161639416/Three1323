import com.db.BeansConfig;
import com.db.Utils.JdbcConfig;
import com.db.Utils.JdbcProperties;
import com.db.controller.Controller;
import com.db.dao.UserDao;
import com.db.service.UserService;
import com.db.service.imp.UserserviceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.Annotation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeansConfig.class)
public class A {
    @Autowired
//    private Controller controller;
    private UserDao userDao;
    @Test
    public void test(){
//        controller.show();
        userDao.show();
    }



}
