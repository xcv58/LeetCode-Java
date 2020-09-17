package com.xcv58.leetcode.number_of_paths_with_max_score;

import java.util.*;

public class Solution {

  public int[] pathsWithMaxScore(List<String> board) {
    if (board == null || board.size() == 0) {
      return new int[] { 0, 0 };
    }
    int m = board.size();
    int n = board.get(0).length();
    int[][][] dp = new int[m][n][2];
    dp[m - 1][n - 1][1] = 1;
    for (int i = m - 1; i >= 0; i--) {
      String row = board.get(i);
      for (int j = n - 1; j >= 0; j--) {
        char c = row.charAt(j);
        if (c == 'X') {
          continue;
        }
        int[] max = getMax(dp, m, n, i, j);
        if (max[1] != 0) {
          dp[i][j][0] = max[0] + (c != 'E' ? c - '0' : 0);
          dp[i][j][1] = max[1];
        }
      }
    }
    return dp[0][0];
  }

  private int[][] DELTAS = new int[][] { { 1, 0 }, { 0, 1 }, { 1, 1 } };

  private int[] getMax(int[][][] dp, int m, int n, int x, int y) {
    int[] res = new int[] { 0, 0 };
    for (int[] delta : DELTAS) {
      int i = x + delta[0];
      int j = y + delta[1];
      if (i < 0 || j < 0 || i >= m || j >= n) {
        continue;
      }
      int[] previous = dp[i][j];
      if (previous[1] == 0) {
        continue;
      }
      if (previous[0] == res[0]) {
        res[1] = (res[1] + previous[1]) % 1_000_000_007;
      }
      if (previous[0] > res[0]) {
        res[0] = previous[0];
        res[1] = previous[1];
      }
    }
    return res;
  }
}
