package com.dezhou.braisedchicken.six.C10RecursionII.Q1ReverseLinkedListInPairs;


class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

public class Solution {
    public ListNode reverseInPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //get the controll of head.next
        ListNode newHead = head.next;
        //head point to the return result from the next recursion
        head.next = reverseInPairs(head.next.next);
        // head.next point to head
        newHead.next = head;
        return newHead;
    }
}
