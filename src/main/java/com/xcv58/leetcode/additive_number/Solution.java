package com.xcv58.leetcode.additive_number;

import java.math.BigInteger;

public class Solution {
    public boolean isAdditiveNumber(String num) {
        if (num == null) {
            return false;
        }
        for (int i = 1; i < num.length() - 1; i++) {
            for (int j = i + 1; j < num.length(); j++) {
                String a = num.substring(0, i);
                if (leadingZero(a)) {
                    continue;
                }
                String b = num.substring(i, j);
                if (leadingZero(b)) {
                    continue;
                }
                if (isAdditiveNumber(new BigInteger(a), new BigInteger(b), num, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean leadingZero(String s) {
        return s.length() != 1 && s.charAt(0) == '0';
    }

    private boolean isAdditiveNumber(BigInteger a, BigInteger b, String num, int index) {
        if (index == num.length()) {
            return true;
        }
        BigInteger c = a.add(b);
        String next = c.toString();
        if (num.indexOf(next, index) != index) {
            return false;
        }
        return isAdditiveNumber(b, c, num, index + next.length());
    }
}
