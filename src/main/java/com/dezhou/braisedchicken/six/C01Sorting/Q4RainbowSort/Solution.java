package com.dezhou.braisedchicken.six.C01Sorting.Q4RainbowSort;

public class Solution {
    public int[] rainbowSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        // three bounds:
        // 1. the left side of neg is -1 (exclusice of neg).
        // 2. the right side of one is 1 (exclusive of one).
        // 3. the part between neg and zero is 0 (exclusive of zero).
        // 4. between zero and one is to be discoverd. (inclusive of both).
        int neg = 0;
        int one = array.length - 1;
        int zero = 0;
        while (zero <= one) {
            if (array[zero] == -1) {
                swap(array, neg++, zero++);
            } else if (array[zero] == 0) {
                zero++;
            } else {
                swap(array, zero, one--);
            }
        }
        return array;
    }

    private void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
