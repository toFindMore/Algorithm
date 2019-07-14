package swordToOffer._15_反转链表;

/**
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Solution {
    private ListNode res;
    public ListNode helper(ListNode node) {
        if(node.next == null) {res = node; return node;}
        //去下一层返回
        ListNode tempNode = helper(node.next);
        tempNode.next = node;
        return node;
    }
    public ListNode ReverseList(ListNode head) {
        if(head == null) return head;
        helper(head);
        head.next = null;
        return res;
    }
}