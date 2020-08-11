package com.xcv58.leetcode.smallest_range_ii;

import java.util.*;

public class Solution {

  public int smallestRangeII(int[] A, int K) {
    if (A == null || A.length < 2) {
      return 0;
    }
    Arrays.sort(A);
    int min = A[0];
    int max = A[A.length - 1];
    int res = max - min;
    for (int i = 0; i < A.length - 1; i++) {
      int left = A[i];
      int right = A[1 + i];
      res =
        Math.min(
          res,
          Math.abs(Math.max(left + K, max - K) - Math.min(right - K, min + K))
        );
    }
    return res;
  }
}
