package com.xcv58.leetcode.valid_perfect_square;

public class Solution {

  public boolean isPerfectSquare(int num) {
    long i = 0;
    long j = num;
    while (i < j) {
      long mid = i + (j - i) / 2;
      long prod = mid * mid;
      if (prod == num) {
        return true;
      }
      if (prod > num) {
        j = mid;
      } else {
        i = mid + 1;
      }
    }
    return i * i == num;
  }
}
