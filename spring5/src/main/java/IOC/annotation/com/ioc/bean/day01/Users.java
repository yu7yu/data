package IOC.annotation.com.ioc.bean.day01;

/**
 * @Author LiSDong
 * @ClassName Users
 * @Description
 * @Date 2022/9/8 0:33
 * @Version 1.0
 */
public class Users {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("Users....");
        userDao.nameAge();
    }
}
