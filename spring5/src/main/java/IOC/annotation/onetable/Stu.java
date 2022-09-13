package IOC.annotation.onetable;

/**
 * @Author LiSDong
 * @ClassName Stu
 * @Description
 * @Date 2022/9/12 1:08
 * @Version 1.0
 */
public class Stu {
    private Dept depts;

    @Override
    public String toString() {
        return "Stu{" +
                "depts=" + depts +
                '}';
    }

    public void setDept(Dept depts) {
        this.depts = depts;
    }

    public void add(){
        System.out.println(depts);
    }

}
