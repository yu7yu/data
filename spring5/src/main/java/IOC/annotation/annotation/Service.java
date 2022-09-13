package IOC.annotation.annotation;


import org.springframework.beans.factory.annotation.Value;


import javax.annotation.Resource;


/**
 * @Author LiSDong
 * @ClassName Service
 * @Description
 * @Date 2022/9/12 17:07
 * @Version 1.0
 */

@org.springframework.stereotype.Service
class Service {
    @Value(value = "茉莉")
    private String name;
    @Resource(name = "userDao")
    private Admin admin;

    public void add(){
        System.out.println("add.........");
        System.out.println("茉莉===："  + name);
        admin.user();
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", admin=" + admin +
                '}';
    }



}
