package com.dezhou.braisedchicken.six.C02BinarySearch.Q1FibonacciNumber;

public class Solution {
    /*public static long fibonacci(int K) {
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
    }*/

    public static long fibonacci(int K) {
        if (K == 0) {
            return 0;
        } else if (K == 1) {
            return 1;
        }
        return fibonacci(K - 1) + fibonacci(K - 2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
}


