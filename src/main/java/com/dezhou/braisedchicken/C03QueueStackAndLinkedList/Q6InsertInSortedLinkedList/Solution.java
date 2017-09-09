package com.dezhou.braisedchicken.C03QueueStackAndLinkedList.Q6InsertInSortedLinkedList;

class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

public class Solution {
    public ListNode insert(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        // insert new node before head
        if (head == null || head.value >= value) {
            newNode.next = head;
            return newNode;
        }
        // insert new node after head
        ListNode prev = head;
        while (prev.next != null && prev.next.value < value) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }
}
