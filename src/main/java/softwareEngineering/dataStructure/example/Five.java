package softwareEngineering.dataStructure.example;

/**
 * @author Einstein
 * @version 1.0
 * @description 约瑟夫问题
 * @date 2022/10/24 11:16
 * @see
 */
public class Five {
    /**
     * rear 一开始指向循环链表的尾结点，链表 data 表示编号
     * @param n 表示参加的人数
     * @param m 表示每次报的人数
     * @return
     */
    /*public static ListNode Josephus(int n, int m){
        ListNode head, p, rear;
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m - 1; j++){
                rear = rear.next;
                if(i == 1){
                    head = rear.next;
                    p = head;
                }else{
                    p.next = rear.next;
                    p = rear.next;
                }
                rear.next = p.next;
            }
            p.next = rear;
        }
    }*/
}
