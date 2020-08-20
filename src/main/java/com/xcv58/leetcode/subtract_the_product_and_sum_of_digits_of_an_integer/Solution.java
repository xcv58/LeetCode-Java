package com.xcv58.leetcode.subtract_the_product_and_sum_of_digits_of_an_integer;

public class Solution {

  public int subtractProductAndSum(int n) {
    return prod(n) - sum(n);
  }

  private int sum(int n) {
    if (n < 10) {
      return n;
    }
    return (n % 10) + sum(n / 10);
  }

  private int prod(int n) {
    if (n < 10) {
      return n;
    }
    return (n % 10) * prod(n / 10);
  }
}
