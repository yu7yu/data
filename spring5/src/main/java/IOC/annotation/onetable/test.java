package IOC.annotation.onetable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LiSDong
 * @ClassName test
 * @Description
 * @Date 2022/9/12 1:11
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.add();
    }
}
