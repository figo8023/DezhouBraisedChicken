package com.dezhou.braisedchicken.six.C02BinarySearch.Q1FibonacciNumber;

public class Solution {
    public long fibonacci(int K) {
        long a = 0;
        long b = 1;
        if (K <= 0) {
            return a;
        }
        while (K > 1) {
            long temp = a + b;
            a = b;
            b = temp;
            K--;
        }
        return b;
    }
}
