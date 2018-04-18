package com.dezhou.braisedchicken.six.test;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, 0, k, n, new ArrayList<Integer>());
        return result;
    }
    private static void helper(List<List<Integer>> result, int index, int k, int n, List<Integer> list) {
        if (k == 0) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = index ; i <= n; i++) {
            list.add(i);
            helper(result, i + 1, k - 1, n, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        combine(4, 2);
    }
}