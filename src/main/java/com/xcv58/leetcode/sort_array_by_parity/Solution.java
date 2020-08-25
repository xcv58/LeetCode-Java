package com.xcv58.leetcode.sort_array_by_parity;

public class Solution {

  public int[] sortArrayByParity(int[] A) {
    if (A == null) {
      return A;
    }
    for (int i = 0, j = A.length - 1; i < j; i++, j--) {
      while (i < j && A[i] % 2 == 0) {
        i++;
      }
      while (j > i && A[j] % 2 == 1) {
        j--;
      }
      if (j > i) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
      }
    }
    return A;
  }
}
