package com.dezhou.braisedchicken.C20MidtermII.Q2MinimumCutsForPanlindromes;

public class Solution {
    public int minCuts(String input) {
        char[] array = input.toCharArray();
        int len = array.length;
        if (len == 0) {
            return 0;
        }
        boolean[][] isP = new boolean[len + 1][len + 1];
        int[] minCuts = new int[len + 1];
        for (int end = 1; end <= len; end++) {
            minCuts[end] = end;
            for (int start = end; start >= 1; start--) {
                if (array[start - 1] == array[end - 1]) {
                    isP[start][end] = end - start < 2 || isP[start + 1][end - 1];
                }
                if (isP[start][end]) {
                    minCuts[end] = Math.min(minCuts[end], 1 + minCuts[start - 1]);
                }
            }
        }
        return minCuts[len] - 1;
    }
}
