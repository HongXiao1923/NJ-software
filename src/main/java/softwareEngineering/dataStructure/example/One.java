package softwareEngineering.dataStructure.example;

import softwareEngineering.dataStructure.stracture.ListNode;

/**
 * @author Einstein
 * @version 1.0
 * @description 递归求链表平均值
 * @date 2022/10/19 20:18
 * @see
 */
public class One {
    int data;
    ListNode head;
    float Average(ListNode head, int n){
        if(head.next == null)
            return head.data;
        else    //这地方的 * (n - 1) 是为了“中和”后面的递归n
            return (Average(head.next, n - 1) * (n - 1) + head.data) / n;
    }
}