package IOC.annotation.internal;

/**
 * @Author LiSDong
 * @ClassName Emp
 * @Description
 * @Date 2022/9/11 23:21
 * @Version 1.0
 */
public class Emp {

    private int id;
    private String gender;
    //员工属于某一个部门，使用对象形式表示

    private Dept dept;


    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }

    public void println(){
        System.out.println(id + gender + dept);
    }

}
