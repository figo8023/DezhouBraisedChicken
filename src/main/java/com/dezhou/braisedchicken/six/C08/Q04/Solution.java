package com.dezhou.braisedchicken.six.C08.Q04;

public class Solution {
    public String decompress(String input) {
        char[] array = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            char ch = array[i++];
            int count = array[i] - '0';
            for (int c = 0; c < count; c++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.decompress("a1c0b2c4"));
    }
}