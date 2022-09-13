package sort;

import java.util.Arrays;

/**
 * @Author LiSDong
 * @ClassName InsertionSort
 * @Description  插入排序
 * @Date 2022/9/11 18:09
 * @Version 1.0
 */
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {101,34,11,1,5,3,2,4};
        InsertionSorts(arr);
    }
    public static void InsertionSorts(int[] arr){
        for (int i = 1;i < arr.length; i++){
            int indexValue = arr[i];
            int index = i - 1;
            while (index >= 0 && indexValue < arr[index]){
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = indexValue;
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
    }
}
