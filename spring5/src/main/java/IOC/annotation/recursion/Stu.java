package IOC.annotation.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author LiSDong
 * @ClassName Stu
 * @Description
 * @Date 2022/9/11 23:36
 * @Version 1.0
 */
public class Stu {
    private int[] nickId;

    public void setNickId(int[] nickId) {
        this.nickId = nickId;
    }

    public int[] getNickId() {
        return nickId;
    }
    public void add(){
        System.out.println(Arrays.toString(nickId));
    }
}
