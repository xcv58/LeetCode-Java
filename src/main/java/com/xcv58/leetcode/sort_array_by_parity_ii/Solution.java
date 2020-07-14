package com.xcv58.leetcode.sort_array_by_parity_ii;

public class Solution {

  public int[] sortArrayByParityII(int[] A) {
    if (A == null || A.length == 0) {
      return new int[0];
    }
    int[] res = new int[A.length];
    for (int i = 0, j = 1; i < A.length && j < A.length; i += 2, j += 2) {
      while (i < A.length && A[i] % 2 == 0) {
        res[i] = A[i];
        i += 2;
      }
      while (j < A.length && A[j] % 2 == 1) {
        res[j] = A[j];
        j += 2;
      }
      if (i < A.length && j < A.length) {
        res[i] = A[j];
        res[j] = A[i];
      }
    }
    return res;
  }
}
