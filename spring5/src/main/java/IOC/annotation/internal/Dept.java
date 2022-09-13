package IOC.annotation.internal;

/**
 * @Author LiSDong
 * @ClassName Dept
 * @Description
 * @Date 2022/9/11 23:20
 * @Version 1.0
 */
public class Dept {
    private String emp;
    public void setEmp(String emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "{" +
                "" + emp + '\'' +
                '}';
    }
}
