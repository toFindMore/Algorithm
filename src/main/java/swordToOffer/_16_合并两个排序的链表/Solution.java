package swordToOffer._16_合并两个排序的链表;

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null ) return list2;
        if(list2 == null ) return list1;

        ListNode res;
        if(list1.val>list2.val){ res=list2;list2 = list2.next;}
        else { res=list1;list1 = list1.next; }

        ListNode p1,p2,pre;
        p1 = list1;
        p2 = list2;
        pre = res;

        while(true) {
            if(p1 == null ) { pre.next = p2; break; }
            if(p2 == null ) { pre.next = p1; break; }
            if(p2.val > p1.val && pre.next == p2) { pre.next = p1; p1 = p1.next;}
            else if(p1.val > p2.val && pre.next == p1) { pre.next = p2; p2 = p2.next;}
            else if(p2.val == p1.val) {
                pre.next = p1; p1 = p1.next;
            }
            pre = pre.next;
        }
        return res;
    }
}
