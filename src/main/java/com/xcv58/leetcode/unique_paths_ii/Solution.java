package com.xcv58.leetcode.unique_paths_ii;

public class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if (obstacleGrid == null || obstacleGrid.length == 0) {
      return 0;
    }
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[][] dp = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (obstacleGrid[i][j] == 1) {
          continue;
        }
        if (i == 0 && j == 0) {
          dp[i][j] = 1;
        } else {
          dp[i][j] = (i > 0 ? dp[i - 1][j] : 0) + (j > 0 ? dp[i][j - 1] : 0);
        }
      }
    }
    return dp[m - 1][n - 1];
  }
}
