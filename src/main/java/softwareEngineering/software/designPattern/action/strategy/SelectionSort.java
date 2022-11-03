package softwareEngineering.software.designPattern.action.strategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 选择排序策略
 * @date 2022/11/3 16:49
 * @see
 */
public class SelectionSort implements Sort {
    public int[] sort(int arr[]) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len; i++) {
            temp = arr[i];
            int j;
            int smallestLocation = i;
            for (j = i + 1; j < len; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    smallestLocation = j;
                }
            }
            arr[smallestLocation] = arr[i];
            arr[i] = temp;
        }
        System.out.println("选择排序");
        return arr;
    }
}
