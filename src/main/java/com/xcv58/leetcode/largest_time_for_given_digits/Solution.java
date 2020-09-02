package com.xcv58.leetcode.largest_time_for_given_digits;

import java.util.*;

public class Solution {

  public String largestTimeFromDigits(int[] A) {
    if (A == null || A.length != 4) {
      return "";
    }
    List<List<Integer>> lists = this.getList(A);
    List<Integer> max = lists
      .stream()
      .filter(x -> this.isValidTime(x))
      .max((l1, l2) -> toAbsMins(l1).compareTo(toAbsMins(l2)))
      .orElse(null);
    if (max == null) {
      return "";
    }
    String res = "";
    for (int i = 0; i < max.size(); i++) {
      res += max.get(i);
      if (i == 1) {
        res += ":";
      }
    }
    return res;
  }

  private List<List<Integer>> getList(int[] A) {
    List<List<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < A.length; i++) {
      List<List<Integer>> tmp = this.getList(skipIndex(A, i));
      for (List<Integer> l : tmp) {
        l.add(A[i]);
      }
      lists.addAll(tmp);
      if (tmp.size() == 0) {
        List<Integer> x = new ArrayList<>();
        x.add(A[i]);
        lists.add(x);
      }
    }
    return lists;
  }

  private int[] skipIndex(int[] A, int x) {
    int[] res = new int[A.length - 1];
    for (int i = 0; i < A.length - 1; i++) {
      int j = i >= x ? i + 1 : i;
      res[i] = A[j];
    }
    return res;
  }

  private boolean isValidTime(List<Integer> list) {
    int hour = list.get(0) * 10 + list.get(1);
    int min = list.get(2) * 10 + list.get(3);
    return (hour >= 0 && hour < 24) && (min >= 0 && min < 60);
  }

  private Integer toAbsMins(List<Integer> list) {
    return (
      (list.get(0) * 10 + list.get(1)) * 60 + list.get(2) * 10 + list.get(3)
    );
  }
}
