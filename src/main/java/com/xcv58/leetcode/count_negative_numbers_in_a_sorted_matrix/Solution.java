package com.xcv58.leetcode.count_negative_numbers_in_a_sorted_matrix;

public class Solution {

  public int countNegatives(int[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }
    int res = 0;
    int m = grid.length;
    int n = grid[0].length;
    for (int i = 0; i < m; i++) {
      int[] row = grid[i];
      int s = 0, e = n - 1;
      for (; s < e;) {
        int mid = (s + e) / 2;
        if (row[mid] >= 0) {
          s = mid + 1;
        } else {
          e = mid;
        }
        if (s == e) {
          break;
        }
      }
      if (s < n && row[s] < 0) {
        res += (n - s) * (m - i);
        n = e;
      }
    }
    return res;
  }
}
