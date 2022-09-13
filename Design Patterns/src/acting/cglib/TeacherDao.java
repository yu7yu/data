package acting.cglib;

/**
 * @Author LiSDong
 * @ClassName TeacherDao
 * @Description
 * @Date 2022/9/4 14:22
 * @Version 1.0
 */
public class TeacherDao {
    public String teach() {
        System.out.println("cglib代理 不需要实现接口..........");
        return "hello";
    }
}
