package IOC.annotation;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @Author LiSDong
 * @ClassName UserDao
 * @Description
 * @Date 2022/9/12 17:07
 * @Version 1.0
 */

@Component(value = "userDao")
@Controller
public class UserDao implements Admin {
    @Override
    public void user() {
        System.out.println("userDao............");
    }

}
