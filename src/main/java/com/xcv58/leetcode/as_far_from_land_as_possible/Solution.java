package com.xcv58.leetcode.as_far_from_land_as_possible;

import java.util.*;

public class Solution {
  private int[][] DELTAS = new int[][] {
    { -1, 0 },
    { 1, 0 },
    { 0, 1 },
    { 0, -1 },
  };

  public int maxDistance(int[][] grid) {
    if (grid == null) {
      return -1;
    }
    int N = grid.length;
    List<Integer> set = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (grid[i][j] == 1) {
          set.add(i * N + j);
        }
      }
    }
    int[][] distance = new int[N][N];
    int res = -1;
    while (set.size() > 0) {
      List<Integer> next = new ArrayList<>();
      for (Integer index : set) {
        int i = index / N;
        int j = index % N;
        for (int[] delta : DELTAS) {
          int x = i + delta[0];
          int y = j + delta[1];
          if (x < 0 || y < 0 || x >= N || y >= N) {
            continue;
          }
          if (grid[x][y] == 0 && distance[x][y] == 0) {
            distance[x][y] = distance[i][j] + 1;
            next.add(x * N + y);
            res = Math.max(res, distance[x][y]);
          }
        }
      }
      set = next;
    }
    return res;
  }
}
