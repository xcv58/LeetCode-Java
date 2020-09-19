package com.xcv58.leetcode.form_largest_integer_with_digits_that_add_up_to_target;

import java.util.*;

public class Solution {
  private HashMap<String, List<int[]>> map = new HashMap<>();
  private HashMap<String, Integer> digitMap = new HashMap<>();

  public String largestNumber(int[] cost, int target) {
    if (cost == null || cost.length != 9 || target <= 0) {
      return "0";
    }
    this.map.clear();
    this.digitMap.clear();
    int digits = largestDigit(cost, 0, target);
    // System.out.println(digitMap);
    List<int[]> list = largestNumber(cost, 0, target, digits);
    // System.out.println(digits);
    // System.out.println(list);
    // System.out.println(this.map);
    if (list == null || list.size() == 0) {
      return "0";
    }
    String res = toString(list.get(0));
    for (int[] arr : list) {
      String tmp = toString(arr);
      if (isLarger(tmp, res)) {
        res = tmp;
      }
    }
    return res;
  }

  private int largestDigit(int[] cost, int from, int target) {
    if (target == 0) {
      return 0;
    }
    if (target < 0) {
      return -1;
    }
    if (from >= cost.length) {
      return -1;
    }
    String key = from + "-" + target;
    if (this.digitMap.containsKey(key)) {
      return this.digitMap.get(key);
    }
    int res = -1;
    for (int i = from; i < cost.length; i++) {
      for (int c = 0; c * cost[i] <= target; c++) {
        int sum = c * cost[i];
        int rest = largestDigit(cost, i + 1, target - sum);
        if (rest == -1) {
          continue;
        }
        res = Math.max(res, rest + c);
        // if (res == 7) {
        //   // System.out.println("i: " + i + " c: " + c + " sum: " + sum + " target: " + target + " rest: " + rest);
        // }
      }
    }
    this.digitMap.put(key, res);
    return res;
  }

  private boolean isLarger(String a, String b) {
    if (a.length() > b.length()) {
      return true;
    }
    if (a.length() < b.length()) {
      return false;
    }
    for (int i = 0; i < a.length(); i++) {
      char c1 = a.charAt(i);
      char c2 = b.charAt(i);
      if (c1 > c2) {
        return true;
      }
      if (c1 < c2) {
        return false;
      }
    }
    return false;
  }

  private String toString(int[] arr) {
    String res = "";
    for (int i = arr.length - 1; i >= 0; i--) {
      int c = arr[i];
      while (c-- > 0) {
        res += (i + 1);
      }
    }
    return res;
  }

  private List<int[]> EMPTY_LIST = List.of(new int[9]);

  private List<int[]> largestNumber(
    int[] cost,
    int from,
    int target,
    int digits
  ) {
    if (target == 0 && digits == 0) {
      return EMPTY_LIST;
    }
    if (from >= 9 || target < 0 || digits < 0) {
      return null;
    }
    String key = from + "-" + target + "-" + digits;
    if (map.containsKey(key)) {
      return map.get(key);
    }
    List<int[]> res = new ArrayList<>();
    for (int i = from; i < 9; i++) {
      for (int c = 0; c * cost[i] <= target; c++) {
        int sum = c * cost[i];
        List<int[]> rest = largestNumber(cost, i + 1, target - sum, digits - c);
        if (rest == null) {
          continue;
        }
        for (int[] x : rest) {
          res.add(combine(x, i, c));
        }
      }
    }
    map.put(key, res);
    return res;
  }

  private int[] combine(int[] arr, int index, int c) {
    int[] res = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      res[i] = arr[i];
    }
    res[index] = c;
    return res;
  }
}
