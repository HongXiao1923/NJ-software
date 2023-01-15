package zcyAlgorithm.class2;

/**
 * @author Einstein
 * @version 1.0
 * @description 反转给定链表
 * @date 2023/1/15 21:43
 * @see
 */
public class Code1_ReverseList {

    /*单链表*/
    public static class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }

    /*双向链表*/
    public static class DoubleNode{
        public int value;
        public DoubleNode pre;
        public DoubleNode next;

        public DoubleNode(int value){
            this.value = value;
        }
    }

    /**
     * 单链表的反转
     * @param node
     * @return
     */
    public static Node reverse(Node node){
        Node head = new Node(0);
        Node cur = node, next = node.next;
        head.next = cur;        //初始化
        cur.next = null;
        while(next != null){    //迭代
            cur = next;
            next = next.next;
            cur.next = head.next;
            head.next = cur;
        }
        return head.next;
    }

    /**
     * 双向链表的反转
     * @param node
     * @return
     */
    public static DoubleNode reverse(DoubleNode node){
        DoubleNode head = new DoubleNode(0);
        DoubleNode cur = node, next = node.next;
        head.next = cur;    cur.pre = head;     cur.next = null;
        while(next != null){
            cur = next;     next = next.next;
            cur.pre = head;     cur.next = head.next;
            head.next.pre = cur;    head.next = cur;
        }
        return head.next;
    }
}
