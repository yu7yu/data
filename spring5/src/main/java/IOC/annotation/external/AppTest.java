package IOC.annotation.external;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LiSDong
 * @ClassName AppTest
 * @Description
 * @Date 2022/9/11 22:55
 * @Version 1.0
 */
public class AppTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean01.xml");
        Service userService = applicationContext.getBean("userService", Service.class);
       userService.add();
    }
}
