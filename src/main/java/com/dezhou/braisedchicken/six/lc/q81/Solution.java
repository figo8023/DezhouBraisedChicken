package com.dezhou.braisedchicken.six.lc.q81;

class Solution {
    public boolean search(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                if (target > nums[begin]) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,3};
        int target = 3;
        solution.search(nums, target);
    }
}

            