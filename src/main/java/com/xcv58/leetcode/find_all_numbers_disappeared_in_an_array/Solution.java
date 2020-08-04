package com.xcv58.leetcode.find_all_numbers_disappeared_in_an_array;

import java.util.*;

public class Solution {

  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> res = new ArrayList<>();
    if (nums == null || nums.length < 1) {
      return res;
    }
    for (int i = 0; i < nums.length;) {
      int num = nums[i];
      if (num == 0 || num == i + 1) {
        i++;
        continue;
      }
      int tmp = nums[num - 1];
      if (tmp == num) {
        nums[i] = 0;
        i++;
      } else {
        nums[num - 1] = num;
        nums[i] = tmp;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        res.add(i + 1);
      }
    }
    return res;
  }
}
