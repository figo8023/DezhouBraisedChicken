package com.dezhou.braisedchicken.six.lc.q205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer sValue = mapS.put(s.charAt(i), i);
            Integer tValue = mapT.put(t.charAt(i), i);
            if (sValue != null && tValue != null) {
                if (sValue.intValue() != tValue.intValue()) {
                    return false;
                }

            } else if (sValue != tValue) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isIsomorphic("adddd","egggg");
    }
}