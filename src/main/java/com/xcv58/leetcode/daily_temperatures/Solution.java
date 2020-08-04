package com.xcv58.leetcode.daily_temperatures;

import java.util.*;

public class Solution {

  public int[] dailyTemperatures(int[] T) {
    if (T == null) {
      return null;
    }
    int len = T.length;
    LinkedList<Integer>[] cache = new LinkedList[101];
    for (int i = 0; i < len; i++) {
      int t = T[i];
      LinkedList<Integer> indexList = cache[t];
      if (indexList == null) {
        indexList = new LinkedList<>();
        cache[t] = indexList;
      }
      indexList.add(i);
    }
    int[] res = new int[len];
    for (int i = 0; i < len; i++) {
      int t = T[i];
      int min = len + 1;
      for (int j = t + 1; j < cache.length; j++) {
        LinkedList<Integer> indexList = cache[j];
        if (indexList == null) {
          continue;
        }
        min = Math.min(min, indexList.getFirst());
      }
      if (min <= len) {
        res[i] = min - i;
      }
      LinkedList<Integer> indexList = cache[t];
      if (indexList == null) {
        continue;
      }
      indexList.removeFirst();
      if (indexList.size() == 0) {
        cache[t] = null;
      }
    }
    return res;
  }
}
