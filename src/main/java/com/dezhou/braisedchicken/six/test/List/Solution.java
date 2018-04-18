package com.dezhou.braisedchicken.six.test.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public static ListNode sortList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            if (head.val >= 0) {
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            } else {

            }
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(-1);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(-2);
        ListNode e = new ListNode(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode result = sortList(a);
        System.out.println("Test");
    }

}
