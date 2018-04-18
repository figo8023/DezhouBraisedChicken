package com.dezhou.braisedchicken.six.C08.Q03;

public class Solution {
    public String replace(String input, String s, String t) {
        StringBuilder sb = new StringBuilder();
        int fromIndex = 0;
        int matchIndex = input.indexOf(s, fromIndex);
        while (matchIndex != -1) {
            sb.append(input, fromIndex, matchIndex).append(t);
            fromIndex = matchIndex + s.length();
            matchIndex = input.indexOf(s, fromIndex);
        }
        sb.append(input, fromIndex, input.length());
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.replace("dodododo","dod","a"));
    }
}