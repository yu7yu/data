package IOC.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author LiSDong
 * @ClassName UserTest
 * @Description
 * @Date 2022/9/12 18:02
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Completely.class);

        Service service = context.getBean("service", Service.class);
        service.add();
    }

}
