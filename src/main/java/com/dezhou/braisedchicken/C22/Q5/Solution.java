package com.dezhou.braisedchicken.C22.Q5;

import java.util.HashMap;
import java.util.Map;


class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key) {
        this.key = key;
    }
}

public class Solution {
    public TreeNode reconstruct(int[] in, int[] pre) {
        Map<Integer, Integer> inIndex = indexMap(in);
        return helper(pre, inIndex, 0, in.length - 1, 0, pre.length - 1);
    }

    private Map<Integer, Integer> indexMap(int[] in) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }
        return map;
    }

    private TreeNode helper(int[] pre, Map<Integer, Integer> inIndex, int inLeft, int inRight, int preLeft, int preRight) {
        if (inLeft > inRight) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preLeft]);
        int inMid = inIndex.get(root.key);
        root.left = helper(pre, inIndex, inLeft, inMid - 1, preLeft + 1, preLeft + inMid - inLeft);
        root.right = helper(pre, inIndex, inMid + 1, inRight, preRight + inMid - inRight + 1, preRight);
        return root;
    }
}
