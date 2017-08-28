package com.dezhou.braisedchicken.C22.Q3;

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
    public boolean exist(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        List<TreeNode> path = new ArrayList<TreeNode>();
        return helper(root, path, target);
    }

    private boolean helper(TreeNode root, List<TreeNode> path, int sum) {
        path.add(root);
        int tmp = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            tmp += path.get(i).key;
            if (tmp == sum) {
                return true;
            }
        }
        if (root.left != null && helper(root.left, path, sum)) {
            return true;
        }
        if (root.right != null && helper(root.right, path, sum)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
}
