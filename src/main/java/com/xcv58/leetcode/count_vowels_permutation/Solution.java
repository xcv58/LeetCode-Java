package com.xcv58.leetcode.count_vowels_permutation;

public class Solution {
  private long MOD = 1_000_000_007;

  public int countVowelPermutation(int n) {
    if (n < 1) {
      return 0;
    }
    long[] arr = new long[] { 1, 1, 1, 1, 1 };
    while (n-- > 1) {
      long[] tmp = new long[5];
      for (int i = 0; i < 5; i++) {
        tmp[0] = (arr[1] + arr[2] + arr[4]) % MOD;
        tmp[1] = (arr[0] + arr[2]) % MOD;
        tmp[2] = (arr[1] + arr[3]) % MOD;
        tmp[3] = (arr[2]) % MOD;
        tmp[4] = (arr[2] + arr[3]) % MOD;
      }
      arr = tmp;
    }
    long sum = 0;
    for (long num : arr) {
      sum = (sum + num) % MOD;
    }
    return (int) sum;
  }
}
