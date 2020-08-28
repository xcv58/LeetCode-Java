package com.xcv58.leetcode.distinct_subsequences_ii;

import java.util.*;

public class Solution {
  private long MOD = 1_000_000_007;

  public int distinctSubseqII(String S) {
    if (S == null || S.length() == 0) {
      return 0;
    }
    int len = S.length();
    long[] dp = new long[len + 1];
    dp[0] = 1;
    int[] visited = new int[26];
    Arrays.fill(visited, -1);
    for (int i = 0; i < len; i++) {
      int n = S.charAt(i) - 'a';
      dp[i + 1] = (2 * dp[i]) % MOD;
      if (visited[n] != -1) {
        int pre = visited[n];
        dp[i + 1] = (dp[i + 1] - dp[pre] + MOD) % MOD;
      }
      visited[n] = i;
    }
    return (int) dp[len] - 1;
  }
}
