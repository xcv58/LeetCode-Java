package com.xcv58.leetcode.minimum_cost_for_tickets;

import java.util.*;

public class Solution {

  public int mincostTickets(int[] days, int[] costs) {
    if (days == null || days.length == 0) {
      return 0;
    }
    boolean[] needed = new boolean[366];
    for (int i : days) {
      needed[i] = true;
    }
    int[] minCost = new int[366];
    minCost[0] = 0;
    for (int i = 1; i <= 365; i++) {
      if (!needed[i]) {
        minCost[i] = minCost[i - 1];
        continue;
      }
      int min;
      min = minCost[i - 1] + costs[0];
      min = Math.min(min, minCost[Math.max(0, i - 7)] + costs[1]);
      min = Math.min(min, minCost[Math.max(0, i - 30)] + costs[2]);
      minCost[i] = min;
    }
    return minCost[365];
  }
}
