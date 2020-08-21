package com.xcv58.leetcode.restore_the_array;

public class Solution {

  public int numberOfArrays(String s, int k) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    long[] dp = new long[s.length() + 1];
    dp[0] = 1;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j >= 0 && (i - j <= Math.log10(k)); j--) {
        if (isCorrectNumber(s, j, i, k)) {
          dp[i + 1] = (dp[i + 1] + dp[j]) % 1_000_000_007;
        }
      }
    }
    return (int) dp[s.length()];
  }

  private boolean isCorrectNumber(String s, int i, int j, int k) {
    int len = s.length();
    if (i < 0 || j < 0 || i >= len || j >= len || i > j) {
      return false;
    }
    if (s.charAt(i) == '0') {
      return false;
    }
    int res = 0;
    for (int x = i; x <= j; x++) {
      int n = s.charAt(x) - '0';
      if ((Integer.MAX_VALUE - n) / 10 < res) {
        return false;
      }
      res *= 10;
      res += n;
      if (res > k) {
        return false;
      }
    }
    return res <= k;
  }
}
