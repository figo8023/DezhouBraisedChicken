package com.dezhou.braisedchicken.six.C22.Q2;


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
        helper(root, max);
        return max[0];
    }

    private int helper(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left, max);
        int right = helper(root.right, max);
        int sin = Math.max(Math.max(left, right), 0) + root.key;
        max[0] = Math.max(max[0], sin);
        return sin;
    }
  /*public int maxPathSum(TreeNode root) {
    if (root.left == null && root.right == null) {
      return root.key;
    }
    if (root.left == null) {
      return maxPathSum(root.right) + root.key;
    }
    if (root.right == null) {
      return maxPathSum(root.left) + root.key;
    }
    return root.key + Math.max(maxPathSum(root.left), maxPathSum(root.right));
  }*/
  /*public int maxPathSum(TreeNode root) {
    return maxPathSum(root, 0);
  }
  private int maxPathSum(TreeNode root, int sum) {
    sum += root.key;
    if (root.left == null && root.right == null) {
      return sum;
    } else if (root.left == null) {
      return maxPathSum(root.right, sum);
    } else if (root.right == null) {
      return maxPathSum(root.left, sum);
    }
    return Math.max(maxPathSum(root.left, sum), maxPathSum(root.right, sum));
  }*/
}
