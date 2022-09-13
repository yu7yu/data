package sort;

import java.util.Arrays;

/**
 * @Author LiSDong
 * @ClassName BubbleSort
 * @Description  冒泡排序
 * @Date 2022/9/11 17:46
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {101,34,11,1,5,3,2,4};
        BubbleSort.BubbleSorts(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void BubbleSorts(int[] arr){
        // 冒泡排序 的时间复杂度 O(n^2), 自己写出
        int temp = 0; // 临时变量
        boolean flag = false; // 标识变量，表示是否进行过交换
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //System.out.println("第" + (i + 1) + "趟排序后的数组");
            //System.out.println(Arrays.toString(arr));
            if (!flag) { // 在一趟排序中，一次交换都没有发生过
                break;
            } else {
                flag = false; // 重置 flag!!!, 进行下次判断
            }
        }
    }
}
