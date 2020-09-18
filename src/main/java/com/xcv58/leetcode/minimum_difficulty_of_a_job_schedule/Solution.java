package com.xcv58.leetcode.minimum_difficulty_of_a_job_schedule;

public class Solution {

  public int minDifficulty(int[] jobDifficulty, int d) {
    if (jobDifficulty == null) {
      return -1;
    }
    if (jobDifficulty.length < d) {
      return -1;
    }
    int len = jobDifficulty.length;
    int[][][] dp = new int[len][len][d];
    for (int i = 0; i < len; i++) {
      int max = jobDifficulty[i];
      for (int j = i; j < len; j++) {
        max = Math.max(max, jobDifficulty[j]);
        dp[i][j][0] = max;
      }
    }

    for (int k = 1; k < d; k++) {
      for (int i = 0; i < len; i++) {
        for (int j = i; j < len; j++) {
          int res = Integer.MAX_VALUE;
          for (int ii = i; ii < j; ii++) {
            if (j - ii < k - 1) {
              break;
            }
            int left = dp[i][ii][0];
            int right = dp[ii + 1][j][k - 1];
            if (left == -1 || right == -1) {
              break;
            }
            res = Math.min(res, left + right);
          }
          dp[i][j][k] = res == Integer.MAX_VALUE ? -1 : res;
        }
      }
    }
    return dp[0][len - 1][d - 1];
  }
}
