package com.xcv58.leetcode.minimum_increment_to_make_array_unique;

import java.util.*;

public class Solution {

  public int minIncrementForUnique(int[] A) {
    if (A == null) {
      return 0;
    }
    Arrays.sort(A);
    int res = 0;
    for (int i = 1; i < A.length; i++) {
      if (A[i] <= A[i - 1]) {
        int gap = A[i - 1] - A[i] + 1;
        A[i] += gap;
        res += gap;
      }
    }
    return res;
  }
}
