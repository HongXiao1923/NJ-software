package softwareEngineering.software.designPattern.action.strategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 插入排序算法策略
 * @date 2022/11/3 16:48
 * @see
 */
public class InsertionSort implements Sort {
    public int[] sort(int arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j;
            int temp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];

                } else
                    break;
            }
            arr[j] = temp;
        }
        System.out.println("插入排序");
        return arr;
    }
}
