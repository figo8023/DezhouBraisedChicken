package com.dezhou.braisedchicken.six.C06DFS;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> validParentheses(int n) {
    List<String> result = new ArrayList<String>();
    char[] cur = new char[n * 2];
    helper(cur, n, n, 0, result);
    return result;
  }
  private void helper(char[] cur, int left, int right, int index, List<String> result) {
    if (left == 0 && right == 0) {
      result.add(new String(cur));
      System.out.println("final result: " + new String(cur));
      return;
    }
    if (left > 0) {
      cur[index] = '(';
      System.out.println(new String(cur));
      helper(cur, left - 1, right, index + 1, result);
    }
    if (right > left) {
      cur[index] = ')';
      System.out.println(new String(cur));
      helper(cur, left, right - 1, index + 1, result);
    }
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    solution.validParentheses(3);
  }
}
