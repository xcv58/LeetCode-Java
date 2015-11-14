package com.xcv58.leetcode.perfect_squares;

public class Solution {
    public int numSquares(int n) {
        while ((n & 3) == 0) {
            n >>= 2;
        }
        if (n % 8 == 7) {
            return 4;
        }
        for (int i = 0; i * i <= n; i++) {
            int j = (int) Math.sqrt(n - i * i);
            if (i * i + j * j == n) {
                return 1 + (i == 0 ? 0 : 1);
            }
        }
        return 3;
    }
}
