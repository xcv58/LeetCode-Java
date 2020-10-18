package com.xcv58.leetcode.minimum_possible_integer_after_at_most_k_adjacent_swaps_on_digits;

class Solution {

  public String minInteger(String num, int k) {
    if (num == null || k <= 0) {
      return num;
    }
    char[] chars = num.toCharArray();
    for (int i = 0; i < chars.length && k >= 0; i++) {
      int from = chars[i] - '0';
      int min = from;
      int minIndex = -1;
      for (int j = i + 1; j < chars.length && j - i <= k; j++) {
        int cur = chars[j] - '0';
        if (cur < min) {
          min = cur;
          minIndex = j;
        }
      }
      if (minIndex != -1) {
        move(chars, i, minIndex);
        k -= minIndex - i;
      }
    }
    return String.valueOf(chars);
  }

  private void move(char[] chars, int from, int to) {
    char target = chars[to];
    for (int i = to; i > from; i--) {
      chars[i] = chars[i - 1];
    }
    chars[from] = target;
  }
}
