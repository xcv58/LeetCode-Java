package com.xcv58.leetcode.length_of_longest_fibonacci_subsequence;

import java.util.*;

public class Solution {

  public int lenLongestFibSubseq(int[] A) {
    if (A == null || A.length < 3) {
      return 0;
    }
    int len = A.length;
    int[][] dp = new int[len][len];
    for (int[] arr : dp) {
      Arrays.fill(arr, -1);
    }
    int res = 0;
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        int tmp = lenLongestFibSubseq(A, len, i, j, dp);
        res = Math.max(res, tmp);
      }
    }
    return res;
  }

  private int lenLongestFibSubseq(int[] A, int len, int i, int j, int[][] dp) {
    if (dp[i][j] != -1) {
      return dp[i][j];
    }
    if (i == j) {
      return -1;
    }
    int target = A[i] + A[j];
    int index = Arrays.binarySearch(A, target);
    if (index < 0) {
      dp[i][j] = 0;
      return dp[i][j];
    }
    int tmp = lenLongestFibSubseq(A, len, j, index, dp);
    if (tmp == 0) {
      dp[i][j] = 3;
    } else {
      dp[i][j] = 1 + tmp;
    }
    return dp[i][j];
  }
}
