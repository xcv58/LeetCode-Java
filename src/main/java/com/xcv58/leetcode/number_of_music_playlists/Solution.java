package com.xcv58.leetcode.number_of_music_playlists;

public class Solution {
  private long MOD = 1_000_000_007;

  public int numMusicPlaylists(int N, int L, int K) {
    if (N > L || K >= N) {
      return 0;
    }
    long[][] dp = new long[L + 1][N + 1];
    dp[0][0] = 1;
    for (int i = 1; i <= L; i++) {
      for (int j = 1; j <= N; j++) {
        dp[i][j] += dp[i - 1][j - 1] * (N - j + 1);
        dp[i][j] += dp[i - 1][j] * Math.max(0, j - K);
        dp[i][j] %= MOD;
      }
    }
    return (int) dp[L][N];
  }
}
