package sort;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author LiSDong
 * @ClassName SelectSort
 * @Description   选择排序
 * @Date 2022/9/10 20:05
 * @Version 1.0
 */
public class SelectSort {
    public static void main(String[] args) {
        int [] arr = {101,34,119,1};
        selectSort(arr);
    }


    public static void selectSort(int[] arr) {

        //选择排序时间复杂度是 O(n^2)
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

            System.out.println(Arrays.toString(arr));// 1, 34, 119, 101
        }

    }
}

