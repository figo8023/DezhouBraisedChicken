package com.dezhou.braisedchicken.six.C04BinaryTreeAndBinarySearchTree.Q2PreorderTraversalOfBinaryTree;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
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
    public List<Integer> preOrder(TreeNode root) {
        List<Integer> preOrder = new ArrayList<Integer>();
        if (root == null) {
            return preOrder;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.offerFirst(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pollFirst();
            if (cur.right != null) {
                stack.offerFirst(cur.right);
            }
            if (cur.left != null) {
                stack.offerFirst(cur.left);
            }
            preOrder.add(cur.key);
        }
        return preOrder;
    }
}
