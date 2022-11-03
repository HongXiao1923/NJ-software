package softwareEngineering.software.designPattern.action.strategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 冒泡排序算法策略
 * @date 2022/11/3 16:46
 * @see
 */
public class BubbleSort implements Sort {
    public int[] sort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("冒泡排序");
        return arr;
    }
}
