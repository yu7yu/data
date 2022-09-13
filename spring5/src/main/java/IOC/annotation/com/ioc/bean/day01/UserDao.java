package IOC.annotation.com.ioc.bean.day01;

/**
 * @Author LiSDong
 * @ClassName UserDao
 * @Description
 * @Date 2022/9/8 0:34
 * @Version 1.0
 */
public class UserDao {
  public String name;
  int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void nameAge(){
        System.out.println("UserDao.......");
    }
}
