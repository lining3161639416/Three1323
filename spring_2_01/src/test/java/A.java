import com.db.dao.imp.DaoImp;
import com.db.service.Service;
import com.db.service.imp.ServiceImp;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class A {
    @Test
    public void test(){
        ClassPathXmlApplicationContext act=new ClassPathXmlApplicationContext("beans.xml");
//        ClassPathResource cpr = new ClassPathResource("beans.xml");
//        BeanFactory nf=new XmlBeanFactory(cpr);
//        Service service = (Service) nf.getBean("service");
        act.close();
    }
    @Test
    public void test1(){
    ApplicationContext act=new ClassPathXmlApplicationContext("beans.xml");
        Service service = (Service) act.getBean("service");
        service.show();
    }

    @Test
    public void test2(){
        ApplicationContext act=new ClassPathXmlApplicationContext("beans.xml");
        ServiceImp service = act.getBean("service", ServiceImp.class);
        service.show();

    }       
    @Test
    public void test3(){
        ApplicationContext act=new ClassPathXmlApplicationContext("beans.xml");
        DaoImp dao = act.getBean("dao", DaoImp.class);
        dao.show();
    }
    @Test
    public void test4(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Service us1 = ac.getBean("service", ServiceImp.class);
        us1.show();
    }


}
