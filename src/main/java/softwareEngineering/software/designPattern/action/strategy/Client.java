package softwareEngineering.software.designPattern.action.strategy;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/3 16:53
 * @see
 */
public class Client {
    public static void main(String args[]) {
        int arr[] = {1, 4, 6, 2, 5, 8, 3, 7, 10, 9};
        int result[];
        ArrayHandler ah = new ArrayHandler();

        //Sort sort = new SelectionSort();    //使用选择排序
        //Sort sort = new BubbleSort();       //使用冒泡排序
        Sort sort = new InsertionSort();       //使用插入排序

        ah.setSortObj(sort); //设置具体策略
        result = ah.sort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}