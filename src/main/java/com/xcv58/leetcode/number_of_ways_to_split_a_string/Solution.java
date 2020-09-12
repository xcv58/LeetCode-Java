package com.xcv58.leetcode.number_of_ways_to_split_a_string;

public class Solution {
  private long MOD = 1_000_000_007;

  public int numWays(String s) {
    if (s == null || s.length() < 3) {
      return 0;
    }
    char[] chars = s.toCharArray();
    int ones = 0;
    for (char c : chars) {
      if (c == '1') {
        ones++;
      }
    }
    if (ones % 3 != 0) {
      return 0;
    }
    if (ones == 0) {
      return (int) ((long) (chars.length - 1) * (chars.length - 2) / 2 % MOD);
    }
    int target = ones / 3;
    int i1 = lastIndexOfOnes(chars, 0, target);
    int i2 = lastIndexOfOnes(chars, i1 + 1, target);
    long left = 1L + numsOfZero(chars, i1 + 1, i2);
    long right = 1L + numsOfZero(chars, i2 + 1, chars.length);
    return (int) ((left * right) % MOD);
  }

  private int numsOfZero(char[] chars, int from, int to) {
    int count = 0;
    for (int i = from; i < to && i < chars.length; i++) {
      if (chars[i] == '1') {
        return count;
      }
      count++;
    }
    return count;
  }

  private int lastIndexOfOnes(char[] chars, int from, int target) {
    for (int i = from, count = 0; i < chars.length; i++) {
      if (chars[i] == '1') {
        count++;
      }
      if (count == target) {
        return i;
      }
    }
    return chars.length;
  }
}
