package zcyAlgorithm.class1;

/**
 * @author Einstein
 * @version 1.0
 * @description 简单选择排序
 * @date 2023/1/12 13:33
 * @see
 */
public class Code1_Selection {
    public static int[] sort(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }
        for(int i = 0; i < arr.length; i++){
            int min = i, j = i + 1;
            while(j < arr.length){
                if(arr[min] > arr[j]){
                    min = j;
                }
                j++;
            }
            swap(arr, i, min);
        }
        return arr;
    }
    public static void swap(int[] arr, int i , int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
