package IOC.annotation.recursion;

import IOC.annotation.internal.code.Service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LiSDong
 * @ClassName AppTest
 * @Description
 * @Date 2022/9/11 23:37
 * @Version 1.0
 */
public class AppTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext
        context =
                new ClassPathXmlApplicationContext("bean01.xml");
        Service stu = context.getBean("service", Service.class);
        System.out.println("第四步 获取创建 bean 实例对象");
        System.out.println(stu);
        context.close();
    }
}
