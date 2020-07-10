package com.xcv58.leetcode.maximum_sum_of_two_non_overlapping_subarrays;

public class Solution {

  public int maxSumTwoNoOverlap(int[] A, int L, int M) {
    int len = A.length;
    int[] sumL = getSubArraySum(A, L);
    int[] sumM = getSubArraySum(A, M);
    int res = 0;
    for (int i = 0; i < len; i++) {
      for (int j = i; j < len; j++) {
        if (j - i >= M) {
          res = Math.max(res, sumM[i] + sumL[j]);
        }
        if (j - i >= L) {
          res = Math.max(res, sumL[i] + sumM[j]);
        }
      }
    }
    return res;
  }

  private int[] getSubArraySum(int[] A, int L) {
    int[] sum = new int[A.length];
    for (int i = 0; i < A.length - L + 1; i++) {
      if (i == 0) {
        for (int j = i; j < i + L; j++) {
          sum[i] += A[j];
        }
      } else {
        sum[i] = sum[i - 1] - A[i - 1] + A[i + L - 1];
      }
    }
    return sum;
  }
}
