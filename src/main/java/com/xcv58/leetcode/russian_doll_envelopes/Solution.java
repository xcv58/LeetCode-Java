package com.xcv58.leetcode.russian_doll_envelopes;

import java.util.*;

public class Solution {

  public int maxEnvelopes(int[][] envelopes) {
    if (envelopes == null || envelopes.length == 0) {
      return 0;
    }
    Arrays.sort(
      envelopes,
      (e1, e2) -> {
        if (e1[0] == e2[0]) {
          return Integer.compare(e2[1], e1[1]);
        }
        return Integer.compare(e1[0], e2[0]);
      }
    );
    int res = 0;
    int[] dp = new int[envelopes.length];
    for (int[] e : envelopes) {
      int index = Arrays.binarySearch(dp, 0, res, e[1]);
      if (index < 0) {
        index = -index - 1;
      }
      dp[index] = e[1];
      if (index == res) {
        res++;
      }
    }

    return res;
  }
}
