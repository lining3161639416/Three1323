import com.db.controller.Controller;
import com.db.service.imp.UserserviceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class A {
    @Test
    public void test(){
        ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
        Controller controller = c.getBean("controller", Controller.class);
        controller.show();
        System.out.println();
//        UserserviceImp service = c.getBean("userserviceImp", UserserviceImp.class);
//        service.show();

    }


}
