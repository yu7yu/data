package IOC.annotation.internal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LiSDong
 * @ClassName AppTest
 * @Description
 * @Date 2022/9/11 23:25
 * @Version 1.0
 */
public class AppTest {
    public static void main(String[] args) {
        ApplicationContext Context = new
                ClassPathXmlApplicationContext("bean01.xml");
        Emp emp = Context.getBean("emp", Emp.class);
        emp.println();


    }
}
