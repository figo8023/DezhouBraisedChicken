package com.dezhou.braisedchicken.six.C04BinaryTreeAndBinarySearchTree.Q1InorderTravesalOfBinaryTree;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key) {
        this.key = key;
    }
}

public class Solution {
    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> inOrder(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return result;
    }

    private void helper(TreeNode p) {
        if (p.left != null) {
            helper(p.left);
        }
        result.add(p.key);
        if (p.right != null) {
            helper(p.right);
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(11);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        Solution solution = new Solution();
        System.out.println(solution.inOrder(node1));
    }
}
