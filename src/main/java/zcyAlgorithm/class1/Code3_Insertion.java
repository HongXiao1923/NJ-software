package zcyAlgorithm.class1;

/**
 * @author Einstein
 * @version 1.0
 * @description 简单插入排序
 * @date 2023/1/12 14:07
 * @see
 */
public class Code3_Insertion {
    public static int[] sort(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }
        for(int i = 1; i < arr.length; i++){
            int pos = i - 1;
            while(pos >= 0 && arr[pos] > arr[i]){   //寻找待插入位置
                pos--;
            }
            int temp = arr[i];
            for(int j = i; j > pos + 1; j--){      //将待插入位置后的元素顺序向后移一位
                arr[j] = arr[j - 1];
            }
            arr[pos] = temp;              //插入
        }
        return arr;
    }
}
