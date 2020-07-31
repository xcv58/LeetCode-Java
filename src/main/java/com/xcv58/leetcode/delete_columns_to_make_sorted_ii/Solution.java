package com.xcv58.leetcode.delete_columns_to_make_sorted_ii;

public class Solution {

  public int minDeletionSize(String[] A) {
    if (A == null || A.length < 2) {
      return 0;
    }
    int res = 0;
    boolean[] skipped = new boolean[A.length];
    for (int i = 0; i < A[0].length(); i++) {
      int preChar = A[0].charAt(i);
      boolean passed = true;
      boolean[] nextSkipped = new boolean[A.length];
      for (int j = 1; j < A.length; j++) {
        int c = A[j].charAt(i);
        if (skipped[j]) {
          preChar = c;
          continue;
        }
        if (preChar < c) {
          nextSkipped[j] = true;
        } else if (preChar > c) {
          passed = false;
          break;
        }
        preChar = c;
      }
      if (!passed) {
        res++;
        continue;
      }
      int sum = 0;
      for (int j = 0; j < A.length; j++) {
        if (nextSkipped[j]) {
          skipped[j] = true;
        }
        if (skipped[j]) {
          sum++;
        }
      }
      if (sum + 1 == A.length) {
        return res;
      }
    }
    return res;
  }
}
