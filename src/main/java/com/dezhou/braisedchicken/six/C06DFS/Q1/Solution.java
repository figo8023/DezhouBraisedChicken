package com.dezhou.braisedchicken.six.C06DFS.Q1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> subSets(String set) {
        List<String> result = new ArrayList<>();
        if (set == null) {
            return result;
        }
        char[] arraySet = set.toCharArray();
        StringBuilder sb = new StringBuilder();
        helper(arraySet, 0, sb, result);
        return result;
    }

    private void helper(char[] set, int index, StringBuilder sb, List<String> result) {
        if (index == set.length) {
            result.add(sb.toString());
            System.out.print(result);
            return;
        }
        helper(set, index + 1, sb.append(set[index]), result);
        sb.deleteCharAt(sb.length() - 1);
        helper(set, index + 1, sb, result);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.subSets("abc");
    }
}
