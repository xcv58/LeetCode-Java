package com.xcv58.leetcode.delete_columns_to_make_sorted;

public class Solution {

  public int minDeletionSize(String[] A) {
    if (A == null || A.length < 2) {
      return 0;
    }
    int wordLen = A[0].length();
    int res = 0;
    for (int i = 0; i < wordLen; i++) {
      int preChar = A[0].charAt(i);
      for (int j = 0; j < A.length; j++) {
        int c = A[j].charAt(i);
        if (preChar > c) {
          res++;
          break;
        }
        preChar = c;
      }
    }
    return res;
  }
}
