package com.xcv58.leetcode.subarrays_with_k_different_integers;

import java.util.*;

public class Solution {

  public int subarraysWithKDistinct(int[] A, int K) {
    if (A == null) {
      return 0;
    }
    int res = 0;
    HashMap<Integer, Integer> map1 = new HashMap<>();
    HashMap<Integer, Integer> map2 = new HashMap<>();
    for (int i1 = 0, i2 = 0, j = 0; j < A.length; j++) {
      moveRight(A, K, j, map1);
      moveRight(A, K, j, map2);
      i1 = reduce(A, K, i1, map1);
      i2 = reduce(A, K, i2, map2);
      if (map1.size() != K || map2.size() != K) {
        continue;
      }
      i2 = moveLeft(A, K, i2, map2);
      res += i2 - i1 + 1;
    }
    return res;
  }

  private int reduce(int[] A, int K, int from, HashMap<Integer, Integer> map) {
    int i = from;
    while (map.size() > K && i < A.length) {
      int value = map.get(A[i]);
      if (value == 1) {
        map.remove(A[i]);
        return i + 1;
      }
      map.put(A[i], value - 1);
      i++;
    }
    return i;
  }

  private int moveLeft(
    int[] A,
    int K,
    int from,
    HashMap<Integer, Integer> map
  ) {
    for (int i = from; i < A.length; i++) {
      if (map.get(A[i]) == 1) {
        return i;
      }
      map.put(A[i], map.get(A[i]) - 1);
    }
    return A.length;
  }

  private void moveRight(
    int[] A,
    int K,
    int from,
    HashMap<Integer, Integer> map
  ) {
    if (from < A.length) {
      map.put(A[from], map.getOrDefault(A[from], 0) + 1);
    }
  }
}
