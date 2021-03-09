import com.db.Utils.BeanFactyory2;
import com.db.service.Service;
import com.db.service.imp.ServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A {
    @Test
    public void test(){
        //普通
        Service service0=new ServiceImp();
        //解耦
        Service service = (Service) BeanFactyory2.getBean("service");
        service.show();
    }
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Service service = (Service) applicationContext.getBean("service");
        service.show();
    }
}
