package com.xcv58.leetcode.nth_magical_number;

public class Solution {

  public int nthMagicalNumber(int N, int A, int B) {
    int shared = A * B / getShared(A, B);
    long i = 0;
    for (long j = (long) Math.min(A, B) * N; i < j;) {
      long mid = i + (j - i) / 2;
      if (((mid / A) + (mid / B) - (mid / shared)) < N) {
        i = mid + 1;
      } else {
        j = mid;
      }
    }
    return (int) (i % 1_000_000_007);
  }

  private int getShared(int A, int B) {
    if (A == 0) {
      return B;
    }
    return getShared(B % A, A);
  }
}
