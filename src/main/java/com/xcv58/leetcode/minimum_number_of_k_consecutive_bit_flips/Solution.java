package com.xcv58.leetcode.minimum_number_of_k_consecutive_bit_flips;

public class Solution {

  public int minKBitFlips(int[] A, int K) {
    if (A == null || A.length == 0) {
      return -1;
    }
    int[] flipped = new int[A.length + 1];
    int res = 0;
    for (int i = 0, flip = 0; i < A.length; i++) {
      flip ^= flipped[i];
      if (A[i] == flip) {
        res++;
        if (i + K - 1 >= A.length) {
          return -1;
        }
        flip ^= 1;
        flipped[i + K] = 1;
      }
    }
    return res;
  }
}
