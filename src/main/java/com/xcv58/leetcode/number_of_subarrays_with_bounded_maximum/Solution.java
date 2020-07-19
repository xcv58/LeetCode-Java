package com.xcv58.leetcode.number_of_subarrays_with_bounded_maximum;

import java.util.*;

public class Solution {

  public int numSubarrayBoundedMax(int[] A, int L, int R) {
    int res = 0;
    if (A == null || A.length == 0) {
      return res;
    }
    int left = 0;
    int right = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] > R) {
        continue;
      }
      for (left = Math.max(i, left); left < A.length; left++) {
        if (A[left] >= L && A[left] <= R) {
          break;
        }
      }
      for (right = Math.max(right, i + 1); right < A.length; right++) {
        if (A[right] > R) {
          break;
        }
      }
      res += right > left ? right - left : 0;
    }
    return res;
  }
}
