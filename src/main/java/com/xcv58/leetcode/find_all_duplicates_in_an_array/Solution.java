package com.xcv58.leetcode.find_all_duplicates_in_an_array;

import java.util.*;

public class Solution {

  public List<Integer> findDuplicates(int[] nums) {
    if (nums == null) {
      return Arrays.asList();
    }
    HashSet<Integer> res = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];
      if (i + 1 != n) {
        if (nums[n - 1] == n) {
          res.add(n);
        } else {
          nums[i--] = nums[n - 1];
          nums[n - 1] = n;
        }
      }
    }
    return new ArrayList<>(res);
  }
}
