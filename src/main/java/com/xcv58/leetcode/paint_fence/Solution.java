package com.xcv58.leetcode.paint_fence;

public class Solution {
    public int numWays(int n, int k) {
        if (n <= 1) {
            return n * k;
        }
        int a = k, b = 0;
        for (int i = 1; i < n; i++) {
            int tmp = a;
            a = (a + b) * (k - 1);
            b = tmp;
        }
        return a + b;
    }
}