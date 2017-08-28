package com.dezhou.braisedchicken.C24.Q7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> allPairs(int[] array, int target) {
        Arrays.sort(array);
        List<List<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (left > 0 && array[left] == array[left - 1]) {
                left++;
                continue;
            }
            int cur = array[left] + array[right];
            if (cur == target) {
                result.add(Arrays.asList(array[left], array[right]));
                left++;
                right--;
            } else if (cur < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
