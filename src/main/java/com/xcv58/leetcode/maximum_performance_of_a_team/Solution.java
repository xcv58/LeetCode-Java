package com.xcv58.leetcode.maximum_performance_of_a_team;

import java.util.*;

public class Solution {
  private long MOD = 1_000_000_007;

  public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
    Integer[] index = new Integer[n];
    for (int i = 0; i < n; i++) {
      index[i] = i;
    }
    Arrays.sort(index, (i1, i2) -> efficiency[i2] - efficiency[i1]);

    PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);

    long sum = 0;
    long res = 0;
    for (int i = 0; i < n; i++) {
      int x = index[i];
      queue.offer(speed[x]);
      sum += speed[x];
      if (queue.size() > k) {
        sum -= queue.poll();
      }
      res = Math.max(res, (long) sum * efficiency[x]);
    }

    return (int) (res % MOD);
  }
}
