package com.xcv58.leetcode.advantage_shuffle;

import java.util.Arrays;

public class Solution {
  public int[] advantageCount(int[] A, int[] B) {
    int len = A.length;
    int[] res = new int[len];
    int[] used = new int[len];
    Arrays.sort(A);
    for (int i = 0; i < B.length; i++) {
      boolean filled = false;
      for (int j = 0; j < A.length; j++) {
        if (A[j] > B[i] && used[j] == 0) {
          res[i] = A[j];
          used[j] = 1;
          filled = true;
          break;
        }
      }
      if (!filled) {
        for (int j = 0; j < A.length; j++) {
          if (used[j] == 0) {
            res[i] = A[j];
            used[j] = 1;
            break;
          }
        }
      }
    }
    return res;
  }
}
