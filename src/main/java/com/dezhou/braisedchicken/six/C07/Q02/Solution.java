package com.dezhou.braisedchicken.six.C07.Q02;

public class Solution {
    public int missing(int[] array) {
        if (array.length == 0) {
            return 1;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (1 + array.length + 1) * (array.length + 1) / 2 - sum;
    }
}