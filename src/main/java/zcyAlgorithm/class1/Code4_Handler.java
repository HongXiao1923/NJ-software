package zcyAlgorithm.class1;

import java.util.Arrays;

/**
 * @author Einstein
 * @version 1.0
 * @description 强大的测试器
 * @date 2023/1/12 14:26
 * @see
 */
public class Code4_Handler {
    public static void main(String[] args) {
        int testTimes = 100000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for(int i = 0; i < testTimes; i++){
            int[] arr1 = generateRandomArray(maxSize,maxValue);
            int[] arr2 = copyArray(arr1);
            Code1_Selection.sort(arr1);
            comparator(arr2);
            if(!isEqual(arr1, arr2)){
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }

    /**
     * 标准比较器（系统方法）
     * @param arr
     */
    public static void comparator(int[] arr){
        Arrays.sort(arr);
    }

    /**
     * 随机数组产生器
     * @param maxSize
     * @param maxValue
     * @return
     */
    public static int[] generateRandomArray(int maxSize, int maxValue){
        int[] arr = new int[(int)((maxSize + 1) * Math.random()) ];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)((maxValue + 1) * Math.random() - (int)(maxValue * Math.random()));
        }
        return arr;
    }

    /**
     * 手动拷贝数组
     * @param arr
     * @return
     */
    public static int[] copyArray(int[] arr){
        if(arr == null){
            return arr;
        }
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            res[i] = arr[i];
        }
        return res;
    }

    /**
     * 手动模拟数组比较器
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean isEqual(int[] arr1, int[] arr2){
        if((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)){
            return false;
        }
        if(arr1 == null && arr2 == null){
            return true;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
