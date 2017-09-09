package com.dezhou.braisedchicken.C04BinaryTreeAndBinarySearchTree.Q1InorderTravesalOfBinaryTree;


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

    public void helper(TreeNode p) {
        if (p.left != null) {
            helper(p.left);
        }
        result.add(p.key);
        if (p.right != null) {
            helper(p.right);
        }
    }
}
