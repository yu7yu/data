package IOC.annotation.com.ioc.bean.day01;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author LiSDong
 * @ClassName LinkList
 * @Description
 * @Date 2022/9/8 22:56
 * @Version 1.0
 */
@Component(value = "linkList")
public class LinkList {
    String name;
     int age;

    public LinkList(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
