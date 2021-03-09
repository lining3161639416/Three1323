import com.db.controller.view.UserView;
import com.db.model.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class A {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
//        Service service = (Service) c.getBean("userservice", ServiceImp.class);
        UserView userview = c.getBean("userview", UserView.class);
        System.out.println(userview);
    }       
            
            

}
