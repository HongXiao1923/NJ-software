package zcyAlgorithm.class1;

/**
 * @author Einstein
 * @version 1.0
 * @description 冒泡排序(小的上浮）
 * @date 2023/1/12 13:46
 * @see
 */
public class Code2_Bubble {
    public static int[] sort(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }
        for(int i = arr.length - 1; i > 0; i--){
            boolean flag = true;
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if(flag){
                return arr;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int i , int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
