package com.xcv58.leetcode.sum_of_subarray_minimums;

import java.util.*;

public class Solution {
  private int MOD = 1_000_000_007;

  public int sumSubarrayMins(int[] A) {
    if (A == null) {
      return 0;
    }
    int len = A.length;
    int[] left = new int[len];
    int[] right = new int[len];
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < len; i++) {
      while (!stack.empty() && A[stack.peek()] > A[i]) {
        stack.pop();
      }
      left[i] = stack.empty() ? -1 : stack.peek();
      stack.push(i);
    }
    stack.clear();
    for (int i = len - 1; i >= 0; i--) {
      while (!stack.empty() && A[stack.peek()] >= A[i]) {
        stack.pop();
      }
      right[i] = stack.empty() ? len : stack.peek();
      stack.push(i);
    }
    long res = 0;
    for (int i = 0; i < len; i++) {
      res += (long) A[i] * (i - left[i]) * (right[i] - i);
      res %= MOD;
    }
    return (int) res;
  }
}
