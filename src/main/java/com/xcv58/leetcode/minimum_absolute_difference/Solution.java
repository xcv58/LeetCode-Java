package com.xcv58.leetcode.minimum_absolute_difference;

import java.util.*;

public class Solution {

  public List<List<Integer>> minimumAbsDifference(int[] arr) {
    List<List<Integer>> res = new ArrayList<>();
    if (arr.length <= 1) {
      return res;
    }
    Arrays.sort(arr);
    int min = arr[1] - arr[0];
    for (int i = 1; i < arr.length - 1; i++) {
      min = Math.min(min, arr[i + 1] - arr[i]);
    }

    for (int i = 0; i < arr.length - 1; i++) {
      if (min == arr[i + 1] - arr[i]) {
        List<Integer> tmpList = new ArrayList<>();
        tmpList.add(arr[i]);
        tmpList.add(arr[i + 1]);
        res.add(tmpList);
      }
    }
    return res;
  }
}
