package IOC.annotation.com.ioc.bean.day01;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LiSDong
 * @ClassName UserTest
 * @Description
 * @Date 2022/9/3 23:29
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

}


