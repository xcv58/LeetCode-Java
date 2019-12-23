package com.xcv58.leetcode.shift_2d_grid;

import java.util.*;

public class Solution {

  public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    List<List<Integer>> res = new ArrayList<>();
    if (grid == null || grid.length <= 0) {
      return res;
    }
    int m = grid.length;
    int n = grid[0].length;
    int len = m * n;
    int start = (len - (k % len)) % len;
    List<Integer> row = new ArrayList<>();
    for (int i = start, step = 0; step < len; i = (i + 1) % len, step++) {
      int x = i / n;
      int y = i % n;
      row.add(grid[x][y]);
      if (row.size() >= n) {
        res.add(row);
        row = new ArrayList<>();
      }
    }
    return res;
  }
}
