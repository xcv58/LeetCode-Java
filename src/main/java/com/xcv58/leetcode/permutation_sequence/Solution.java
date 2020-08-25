package com.xcv58.leetcode.permutation_sequence;

import java.util.*;

public class Solution {

  public String getPermutation(int n, int k) {
    LinkedList<Integer> nums = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      nums.add(i);
    }
    return getPermutation(nums, k);
  }

  private String getPermutation(LinkedList<Integer> nums, int k) {
    if (nums.size() == 0) {
      return "";
    }
    int chunkSize = 1;
    for (int i = 1; i < nums.size(); i++) {
      chunkSize *= i;
    }
    int total = chunkSize * nums.size();
    if (k > total) {
      // TODO: throw exception
      k = (k - 1) % total + 1;
    }
    int index = Math.max(0, (k - 1) / chunkSize);
    int remain = (k - 1) % chunkSize + 1;
    int prefix = nums.get(index);
    nums.remove(index);
    return prefix + getPermutation(nums, remain);
  }
}
