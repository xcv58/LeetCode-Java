package com.xcv58.leetcode.integer_replacement;

public class Solution {

  public int integerReplacement(int n) {
    int trailingZerors = 0;
    while (n % 2 == 0 && n > 1) {
      trailingZerors++;
      n >>= 1;
    }
    if (n <= 1) {
      return trailingZerors;
    }
    int bits = 0, tmp = n;
    while (tmp % 2 == 1) {
      bits++;
      tmp >>= 1;
    }
    return (
      trailingZerors +
      Math.min(
        bits + 1 + this.integerReplacement(tmp + 1),
        2 + this.integerReplacement(n / 2)
      )
    );
  }
}
