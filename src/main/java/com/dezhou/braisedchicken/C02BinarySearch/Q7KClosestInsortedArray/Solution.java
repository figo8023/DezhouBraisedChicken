package com.dezhou.braisedchicken.C02BinarySearch.Q7KClosestInsortedArray;

//K Closest In Sorted Array
public class Solution {
    public static int[] kClosest(int[] array, int target, int k) {
        if (array == null || array.length == 0) {
            return array;
        }
        if (k == 0) {
            return new int[0];
        }
        //left is the index of the largest smaller or equal element
        //right = left + 1
        // These two should be the closest to target
        int left = largestSmallerEqual(array, target);
        int right = left + 1;
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            //we can advance the left pointer when:
            //1. right pointer is already out of bound.
            //2. right pointer is not out of bound, left is not out of
            //bound, and array[left] is closer to target.
            if (right >= array.length || left >= 0 && target - array[left] <= array[right] - target) {
                result[i] = array[left--];
            } else {
                result[i] = array[right++];
            }
        }
        return result;
    }

    private static int largestSmallerEqual(int[] array, int target) {
        // find the largest smaller or equal element's index in the array
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (array[right] <= target) {
            return right;
        }
        if (array[left] <= target) {
            return left;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 2, 2, 2, 2, 2, 2};
        int result = largestSmallerEqual(test, 2);
        System.out.println(result);
    }
}