package IOC.annotation.external;


/**
 * @Author LiSDong
 * @ClassName Service
 * @Description
 * @Date 2022/9/11 22:52
 * @Version 1.0
 */
public class Service{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        System.out.println("Service......");
        userDao.update();
    }
}
