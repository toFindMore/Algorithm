package swordToOffer._14_链表中倒数第k个结点;

/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution {

    public ListNode FindKthToTail(ListNode head, int k) {
        int cnt = 0;
        ListNode copyList = head;
        while(copyList != null) {
            cnt++;
            copyList = copyList.next;
        }
        cnt = cnt-k;
        copyList = head;
        while(copyList != null) {
            if(cnt == 0){
                return copyList;
            }
            cnt--;
            copyList = copyList.next;
        }
        return null;
    }
}