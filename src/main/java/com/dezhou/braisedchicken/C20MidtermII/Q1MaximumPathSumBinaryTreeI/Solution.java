package com.dezhou.braisedchicken.C20MidtermII.Q1MaximumPathSumBinaryTreeI;


class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key) {
        this.key = key;
    }
}

public class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[]{Integer.MIN_VALUE};
        maxSumHelper(root, max);
        return max[0];
    }

    private int maxSumHelper(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }
        int left = maxSumHelper(root.left, max);
        int right = maxSumHelper(root.right, max);
        if (root.left != null && root.right != null) {
            max[0] = Math.max(max[0], left + right + root.key);
            return Math.max(left, right) + root.key;
        }
        return root.left == null ? right + root.key : left + root.key;
    }
}
