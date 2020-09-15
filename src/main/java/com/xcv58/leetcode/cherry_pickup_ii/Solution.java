package com.xcv58.leetcode.cherry_pickup_ii;

import java.util.*;

public class Solution {
  private List<Integer> DELTAS = List.of(-1, 0, 1);

  public int cherryPickup(int[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }
    int m = grid.length;
    int n = grid[0].length;
    int[][][] dp = new int[m][n][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          dp[i][j][k] = -1;
        }
      }
    }
    dp[0][0][n - 1] = grid[0][0] + (n > 1 ? grid[0][n - 1] : 0);
    for (int i = 1; i < m; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          int max = getMax(dp[i - 1], n, j, k);
          if (max >= 0) {
            dp[i][j][k] = max + grid[i][j] + (j != k ? grid[i][k] : 0);
          }
        }
      }
    }
    int res = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        res = Math.max(res, dp[m - 1][i][j]);
      }
    }
    return Math.max(res, 0);
  }

  private int getMax(int[][] pre, int n, int x, int y) {
    int res = -1;
    for (int xx : DELTAS) {
      for (int yy : DELTAS) {
        int i = x + xx;
        int j = y + yy;
        if (i < 0 || i >= n || j < 0 || j >= n) {
          continue;
        }
        res = Math.max(res, pre[i][j]);
      }
    }
    return res;
  }
}
