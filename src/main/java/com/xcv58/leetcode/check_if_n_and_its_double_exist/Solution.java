package com.xcv58.leetcode.check_if_n_and_its_double_exist;

import java.util.*;

public class Solution {

  public boolean checkIfExist(int[] arr) {
    if (arr == null || arr.length == 0) {
      return false;
    }
    HashSet<Integer> set = new HashSet<>();
    for (int a : arr) {
      if (set.contains(a * 2)) {
        return true;
      }
      if ((a % 2 == 0) && set.contains(a / 2)) {
        return true;
      }
      set.add(a);
    }
    return false;
  }
}
