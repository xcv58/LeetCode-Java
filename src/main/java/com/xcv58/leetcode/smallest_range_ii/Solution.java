package com.xcv58.leetcode.smallest_range_ii;

import java.util.*;

public class Solution {

  public int smallestRangeII(int[] A, int K) {
    if (A == null || A.length < 2) {
      return 0;
    }
    int res = Integer.MAX_VALUE;
    for (int i = 0; i < A.length; i++) {
      for (int max : Arrays.asList(A[i] + K, A[i] - K)) {
        int range = getRange(A, K, max);
        if (range >= 0) {
          res = Math.min(res, range);
        }
      }
    }
    return res;
  }

  private int getRange(int[] A, int K, int max) {
    int min = max;
    for (int i = 0; i < A.length; i++) {
      if (A[i] + K <= max) {
        min = Math.min(min, A[i] + K);
      } else if (A[i] - K <= max) {
        min = Math.min(min, A[i] - K);
      } else {
        return -1;
      }
    }
    return max - min;
  }
}
