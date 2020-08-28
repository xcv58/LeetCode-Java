package com.xcv58.leetcode.count_odd_numbers_in_an_interval_range;

public class Solution {

  public int countOdds(int low, int high) {
    return (high / 2) - (low / 2) + (high % 2);
  }
}
