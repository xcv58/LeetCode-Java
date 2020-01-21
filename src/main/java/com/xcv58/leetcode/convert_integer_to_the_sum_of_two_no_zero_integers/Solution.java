package com.xcv58.leetcode.convert_integer_to_the_sum_of_two_no_zero_integers;

public class Solution {

  public int[] getNoZeroIntegers(int n) {
    int[] res = new int[2];
    if (n == 0) {
      return res;
    }
    int d1, d2, next = n / 10;
    int digit = n % 10;
    if (digit > 1 || n < 10) {
      d1 = digit / 2;
      d2 = digit - d1;
    } else {
      d1 = 2;
      d2 = digit - d1 + 10;
      next--;
    }
    int[] rest = this.getNoZeroIntegers(next);
    res[0] = rest[0] * 10 + d1;
    res[1] = rest[1] * 10 + d2;
    return res;
  }
}
