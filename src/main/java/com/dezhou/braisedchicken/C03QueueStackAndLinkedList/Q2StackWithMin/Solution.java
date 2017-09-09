package com.dezhou.braisedchicken.C03QueueStackAndLinkedList.Q2StackWithMin;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public Solution() {
        stack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        int result = stack.pollFirst();
        if (minStack.peekFirst().equals(result)) {
            minStack.pollFirst();
        }
        return result;
    }

    public void push(int element) {
        stack.offerFirst(element);
        if (minStack.isEmpty() || element <= minStack.peekFirst()) {
            minStack.offerFirst(element);
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peekFirst();
    }

    public int min() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peekFirst();
    }
}
