package com.dezhou.braisedchicken.six.C07.Q03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> common(List<Integer> A, List<Integer> B) {
        List<Integer> result = new ArrayList<Integer>();
        if (A.isEmpty() || B.isEmpty()) {
            return result;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                result.add(A.get(i));
                i++;
                j++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return result;
    }
}
