package com.xcv58.leetcode.unique_paths_iii;

import java.util.*;

public class Solution {

  public int uniquePathsIII(int[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }
    int m = grid.length;
    int n = grid[0].length;
    int x = 0, y = 0;
    int size = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 0) {
          size++;
        }
        if (grid[i][j] == 1) {
          x = i;
          y = j;
        }
      }
    }
    return uniquePathsIII(grid, m, n, x, y, size, 0);
  }

  private int uniquePathsIII(
    int[][] grid,
    int m,
    int n,
    int x,
    int y,
    int size,
    int visited
  ) {
    if (x < 0 || y < 0 || x >= m || y >= n) {
      return 0;
    }
    if (grid[x][y] == 2) {
      if (size == visited) {
        return 1;
      }
      return 0;
    }
    int origin = grid[x][y];
    if (origin == -1 || origin == 3) {
      return 0;
    }
    int res = 0;
    grid[x][y] = 3;
    res += uniquePathsIII(grid, m, n, x + 1, y, size, visited + (1 - origin));
    res += uniquePathsIII(grid, m, n, x - 1, y, size, visited + (1 - origin));
    res += uniquePathsIII(grid, m, n, x, y + 1, size, visited + (1 - origin));
    res += uniquePathsIII(grid, m, n, x, y - 1, size, visited + (1 - origin));
    grid[x][y] = origin;
    return res;
  }
}
