package zcyAlgorithm.class2;

/**
 * @author Einstein
 * @version 1.0
 * @description 在链表中删除给定值
 * @date 2023/1/15 22:10
 * @see
 */
public class Code2_DelGivenValue {

    /*单链表*/
    public static class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }

    /**
     * 单链表删除给定值
     * @param head
     * @param val
     */
    public static Node deleteGivenValue(Node head, int val){
        while(head != null){        //排除开头的给定值
            if(head.value != val){
                break;
            }
            head = head.next;
        }
        Node pre = head;
        Node cur = head.next;
        while(cur != null){
            if(cur.value == val){
                cur = cur.next;
            }else{
                pre.next = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
