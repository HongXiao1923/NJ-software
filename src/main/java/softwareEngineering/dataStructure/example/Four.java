package softwareEngineering.dataStructure.example;

/**
 * @author Einstein
 * @version 1.0
 * @description 小根堆中随机插入一个节点，插入位置为start（末尾），请调整节点以符合小根堆定义
 * @date 2022/10/21 11:25
 * @see
 */
public class Four {
    private static void percUp(int[] a, int start){  //Comparable[] a
        int j = start, i = j / 2;
        int temp = a[j];

        while(j > 1){
            if(a[i] <= a[j])    //已满足条件
                break;
            //调整位置
            a[j] = a[i];
            j = i;
            i /= 2;
            a[j] = temp;
        }
    }
}
