package com.dezhou.braisedchicken.C03QueueStackAndLinkedList.Q3ReverseLinkedList;


class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

public class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
