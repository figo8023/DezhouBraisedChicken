package com.dezhou.braisedchicken.six.C21.Q2;

class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key) {
        this.key = key;
    }
}

public class Solution {
    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (root.key > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
}