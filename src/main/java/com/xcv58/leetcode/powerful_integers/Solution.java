package com.xcv58.leetcode.powerful_integers;

import java.util.*;

public class Solution {

  public List<Integer> powerfulIntegers(int x, int y, int bound) {
    HashSet<Integer> sumSet = new HashSet<>();
    List<Integer> xList = getPowes(x, bound);
    List<Integer> yList = getPowes(y, bound);
    for (int xx : xList) {
      for (int yy : yList) {
        int sum = xx + yy;
        if (sum > 1 && sum <= bound) {
          sumSet.add(sum);
        }
      }
    }
    return new ArrayList<>(sumSet);
  }

  private List<Integer> getPowes(int x, int num) {
    if (x <= 1) {
      return Arrays.asList(1);
    }
    List<Integer> res = new ArrayList<>();
    for (int xx = 1; xx < num; xx *= x) {
      res.add(xx);
    }
    return res;
  }
}
