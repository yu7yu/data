package acting.Dynamic;

/**
 * @Author LiSDong
 * @ClassName TeacherDao
 * @Description
 * @Date 2022/9/4 14:25
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {

        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {

        System.out.println("hello " + name);
    }
}
