package com.leetcode.B_median;

import com.leetcode.D_datastructure.ListNode;

import java.util.Scanner;

/**
 * @author Einstein
 * @version 1.0
 * @description 两数相加： https://leetcode.cn/problems/add-two-numbers
 * @date 2022/10/12 18:52
 */

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 */

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), n = in.nextInt();
        ListNode l1 = new ListNode(), l2 = new ListNode();
        ListNode p1 = l1, p2 = l2;
        for (int i = 0; i < m; i++) {
            p1.val = in.nextInt();
            p1.next = new ListNode();
            p1 = p1.next;
        }
        for (int i = 0; i < n; i++) {
            p2.val = in.nextInt();
            p2.next = new ListNode();
            p2 = p2.next;
        }
        //
        ListNode ans = addTwoNumbers2(l1, l2);
        for (int i = 0; i < Math.max(m, n); i++) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
        //针对最后还有进位的情况
        if(ans.val == 1){
            System.out.println(ans.val);
        }
    }

    /**
     * 暴力迭代法：顺序遍历两个链表，依次记录当前求和的个位值，并记录当前是否有进位以便为考虑到下次计算
     * 时空：O(max(m,n))、O(max(m,n))   空间主要时用在创建链表上，当然这个空间可以省下来
     * 关于省空间的优化方式及代码优化见解法2
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);
        ListNode ret = cur;
        //ten记录当前计算是否有进位，value即为当前计算的个位值
        int ten = 0, value = 0;
        while(l1 != null && l2 != null){
            value = (l1.val + l2.val + ten) % 10;
            ten =  (l1.val + l2.val + ten) / 10;
            cur.next = new ListNode(value);
            cur = cur.next; l1 = l1.next;   l2 = l2.next;
        }
        //一下两个while只会执行一个
        while(l1 != null){
            value = (l1.val + ten) % 10;
            ten =  (l1.val + ten) / 10;
            cur.next = new ListNode(value);
            cur = cur.next; l1 = l1.next;
        }
        while(l2 != null){
            value = (l2.val + ten) % 10;
            ten =  (l2.val + ten) / 10;
            cur.next = new ListNode(value);
            cur = cur.next; l2 = l2.next;
        }
        //针对最后一位还有进位的情况
        if(ten == 1){
            cur.next = new ListNode(1);
        }

        return ret.next;
    }

    //但提交的代码只通过 1152/1568，但是本地IDE是可以通过的
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode ret = l1, pre = l1;
        //ten记录当前计算是否有进位，value即为当前计算的个位值
        int ten = 0, value = 0;
        while(l1 != null && l2 != null){
            value = (l1.val + l2.val + ten) % 10;
            ten =  (l1.val + l2.val + ten) / 10;
            l1.val = value;
            pre = l1;   l1 = l1.next;   l2 = l2.next;
        }
        //判断l1尾指针是否为空，否则需要将l1连接到l2，然后作统一处理
        if(l1 == null){
            pre.next = l2;  l1 = pre;
        }
        while(l1 != null){
            value = (l1.val + ten) % 10;
            ten =  (l1.val + ten) / 10;
            l1.val = value;
            pre = l1;   l1 = l1.next;
        }
        //针对最后一位还有进位的情况
        if(ten == 1){
            pre.next = new ListNode(1);
        }

        return ret;
    }

    //解法1、2的逻辑优化（代码优化）版本
    public static ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        //设置哑结点作临时头指针
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        //设置进位标志
        int flag = 0;
        while(l1 != null || l2 != null) {
            int x = (l1 == null) ? 0 : l1.val;
            int y = (l2 == null) ? 0 : l2.val;
            int sum = x + y + flag;

            flag = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if(l1 != null)  l1 = l1.next;
            if(l2 != null)  l2 = l2.next;
        }
        if(flag == 1) {
            cur.next = new ListNode(flag);
        }
        return pre.next;
    }

    //递归版本
    public static ListNode addTwoNumbers4(ListNode l1, ListNode l2, int flag){
        //出口，两个节点都为null，说明到了最后一个节点
        if(l1 == null && l2 == null){
            //再判断进位是否为0
            if(flag == 0){
                return null;
            }
            return new ListNode(flag);
        }
        //初始化链表，并且算出当前节点和进位相加的和
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + flag;
        flag = sum > 9 ? 1 : 0;

        if(l1 != null)  l1 = l1.next;
        if(l2 != null)  l2 = l2.next;
        //当前节点的值，指向下一节点的指针
        return new ListNode(sum % 10, addTwoNumbers4(l1, l2, flag));
    }
}
