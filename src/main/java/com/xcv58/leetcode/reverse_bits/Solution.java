package com.xcv58.leetcode.reverse_bits;

public class Solution {

  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int m = 0;
    for (int i = 0; i < 32; i++, n >>= 1) {
      m <<= 1;
      m |= n & 1;
    }
    return m;
  }
}
