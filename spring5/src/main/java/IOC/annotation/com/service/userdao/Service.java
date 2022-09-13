package IOC.annotation.com.service.userdao;

/**
 * @Author LiSDong
 * @ClassName Service
 * @Description
 * @Date 2022/9/8 23:25
 * @Version 1.0
 */
public class Service {
    private String name;
    private int age;

    private UserDao userDao;

    public void add(){
        System.out.println("Service.....");

        userDao.pop();
    }

}
