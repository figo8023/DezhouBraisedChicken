package com.dezhou.braisedchicken.C26.Q2;

import java.util.Arrays;

public class Solution {
    public double median(int[] a, int[] b) {
        int len = a.length + b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        if (len % 2 == 1) {
            return findKth(a, 0, b, 0, len / 2 + 1);
        }
        return (
                findKth(a, 0, b, 0, len / 2) + findKth(a, 0, b, 0, len / 2 + 1)
        ) / 2.0;
    }

    public static int findKth(int[] A, int A_start, int[] B, int B_start, int k) {
        if (A_start >= A.length) {
            return B[B_start + k - 1];
        }
        if (B_start >= B.length) {
            return A[A_start + k - 1];
        }

        if (k == 1) {
            return Math.min(A[A_start], B[B_start]);
        }

        int A_key = A_start + k / 2 - 1 < A.length
                ? A[A_start + k / 2 - 1]
                : Integer.MAX_VALUE;
        int B_key = B_start + k / 2 - 1 < B.length
                ? B[B_start + k / 2 - 1]
                : Integer.MAX_VALUE;

        if (A_key < B_key) {
            return findKth(A, A_start + k / 2, B, B_start, k - k / 2);
        } else {
            return findKth(A, A_start, B, B_start + k / 2, k - k / 2);
        }
    }

}