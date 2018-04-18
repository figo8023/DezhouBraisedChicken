package com.dezhou.braisedchicken.six.C08.Q01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> permutations(String set) {
        List<String> result = new ArrayList<String>();
        if (set == null) {
            return result;
        }
        char[] array = set.toCharArray();
        helper(array, 0, result);
        return result;
    }

    private void helper(char[] array, int index, List<String> result) {
        if (index == array.length) {
            result.add(new String(array));
            return;
        }
        Set<Character> used = new HashSet<Character>();
        for (int i = index; i < array.length; i++) {
            if (used.add(array[i])) {
                swap(array, i, index);
                helper(array, index + 1, result);
                swap(array, i, index);
            }
        }
    }

    private void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
