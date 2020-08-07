package com.xcv58.leetcode.k_th_smallest_prime_fraction;

public class Solution {

  public int[] kthSmallestPrimeFraction(int[] A, int K) {
    if (A == null) {
      return null;
    }
    int[] res = new int[2];
    for (double low = 0.0, high = 1.0; high - low > 0.0000001;) {
      double mid = (low + high) / 2.0;
      int[] tmp = getCountAndPair(A, mid);
      if (tmp[0] > K) {
        high = mid;
      } else {
        res[0] = tmp[1];
        res[1] = tmp[2];
        low = mid;
      }
    }
    return res;
  }

  private int[] getCountAndPair(int[] A, double target) {
    int[] res = new int[] { 0, 0, 1 };
    for (int i = 1, j = -1; i < A.length; i++) {
      while (j + 1 < A.length && A[j + 1] < A[i] * target) {
        j++;
      }
      if (j >= 0 && res[1] * A[i] < res[2] * A[j]) {
        res[1] = A[j];
        res[2] = A[i];
      }
      res[0] += j + 1;
    }
    return res;
  }
}
