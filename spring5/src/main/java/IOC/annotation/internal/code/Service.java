package IOC.annotation.internal.code;

/**
 * @Author LiSDong
 * @ClassName Service
 * @Description
 * @Date 2022/9/11 23:49
 * @Version 1.0
 */
public class Service {
    private String nickName;

    public Service() {
        System.out.println("第一步 执行无参数构造创建 bean 实例");
    }


    public void setNickName(String nickName) {
        this.nickName = nickName;
        System.out.println("第二步 调用 set 方法设置属性值");
    }

    //创建执行的初始化的方法

    public void initMethod() {
        System.out.println("第三步 执行初始化的方法");
    }

    //创建执行的销毁的方法

    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");
    }

    @Override
    public String toString() {
        return "Service{" +
                "nickName='" + nickName + '\'' +
                '}';
    }
}

