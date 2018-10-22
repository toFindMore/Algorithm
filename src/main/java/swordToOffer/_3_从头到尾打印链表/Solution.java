package swordToOffer._3_从头到尾打印链表;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Solution {
    public void helper(ArrayList<Integer> res, ListNode listNode) {
        if(listNode == null) return;
        helper(res,listNode.next);
        res.add(listNode.val);
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        helper(res,listNode);
        return res;
    }
}
