package com.dezhou.braisedchicken.six.C07.Q04;

public class Solution {
    public String deDup(String input) {
        if (input == null) {
            return input;
        }
        char[] array = input.toCharArray();
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array[end - 1]) {
                array[end++] = array[i];
            }
        }
        return new String(array, 0, end);
    }
}