package com.leetcode.B_median;

import com.leetcode.D_datastructure.ListNode;

import java.util.ArrayList;

/**
 * @author Einstein
 * @version 1.0
 * @description 重排链表：https://leetcode.cn/problems/reorder-list/
 * @date 2022/10/14 17:06
 * @see
 */

/**
 * 原链表：L0 → L1 → … → Ln - 1 → Ln
 * 重排后：L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * 注意：不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class OneFourThree {
    public static void main(String[] args) {

    }

    /**
     * 穿线法：先对链表翻转得到一个新的链表，然后在原链表和新链表之间穿线得到最终链表
     *        不过构建一个新链表的时空复杂度都比较高，因此方案要改进
     *        改进：将原链表分割为两半，并将后一半链表进行翻转，然后再执行穿线
     * 时空：O(n)、O(n)
     * @param head
     */
    public static void reorderList(ListNode head) {

    }

    /**
     * 暴力解法：直接遍历，每次都要遍历到尾指针，然后将尾指针进行插入
     * 时空：O(n^2)、O(1)
     * @param head
     */
    public static void reorderList2(ListNode head) {
        ListNode pre = head, post = pre.next, rear = null;
        boolean flag = false;
        if(post != null){   //3个结点以下的情况不进入while
            if(post.next != null)   flag = true;
        }

        while(flag){
            rear = searchRear(post);
            pre.next = rear;
            rear.next = post;
            pre = post; post = post.next;
            //判定结束条件
            if(post == null || post.next == null)
                flag = false;
        }
        return ;
    }

    /**
     * 基本思路：先把链表里的值全部取出来，然后再用双指针进行重新赋值
     * 注：此思路虽然可行，但是不满足题目条件“不改变结点内部的值”
     * 时空：O(n)、O(n)
     * @param head
     */
    public static void reorderList3(ListNode head) {
        ArrayList<Integer> list = new ArrayList();
        ListNode cur = head;
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        cur = head;
        int i = 0, j = list.size() - 1;
        for( ; i < j; i++, j--){
            cur.val = list.get(i);
            cur = cur.next;
            cur.val = list.get(j);
            cur = cur.next;
        }
        if(i == j){ //对最后一项做补充
            cur.val = list.get(i);
        }
    }

    /**
     * 寻找尾指针，配合解法2使用
     * @param head
     * @return
     */
    public static ListNode searchRear(ListNode head){
        ListNode pre = head;
        while(head.next != null){
            pre = head;
            head = head.next;
        }
        //将尾结点与前一个结点断开
        pre.next = null;
        return head;
    }
}
