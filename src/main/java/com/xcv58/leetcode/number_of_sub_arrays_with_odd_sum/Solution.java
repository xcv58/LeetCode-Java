package com.xcv58.leetcode.number_of_sub_arrays_with_odd_sum;

public class Solution {
  private long MOD = 1_000_000_007;

  public int numOfSubarrays(int[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    long res = 0;
    for (int i = 0, preOdd = 0; i < arr.length; i++) {
      int tmp = (arr[i] % 2 == 0) ? preOdd : i + 1 - preOdd;
      res = (res + tmp) % MOD;
      preOdd = tmp;
    }
    return (int) res;
  }
}
