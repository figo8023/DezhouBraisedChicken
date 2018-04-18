package com.dezhou.braisedchicken.six.C08.Q06;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longest(String input) {
        Set<Character> distinct = new HashSet<>();
        int slow = 0;
        int fast = 0;
        int longest = 0;
        while (fast < input.length()) {
            if (distinct.contains(input.charAt(fast))) {
                distinct.remove(input.charAt(slow++));
            } else {
                distinct.add(input.charAt(fast++));
                longest = Math.max(longest, fast - slow);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longest("bcdfbd"));
    }

}