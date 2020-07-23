package com.xcv58.leetcode.valid_mountain_array;

public class Solution {

  public boolean validMountainArray(int[] A) {
    if (A == null || A.length < 3) {
      return false;
    }
    int i = 1;
    for (; i < A.length; i++) {
      if (A[i] <= A[i - 1]) {
        break;
      }
    }
    if (i == 1 || i == A.length) {
      return false;
    }
    for (int j = i; j < A.length; j++) {
      if (A[j] >= A[j - 1]) {
        return false;
      }
    }
    return true;
  }
}
