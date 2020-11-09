package com.xcv58.leetcode.russian_doll_envelopes;

import java.util.*;

public class Solution {

  public int maxEnvelopes(int[][] envelopes) {
    return maxEnvelopes(new int[] { -1, -1 }, envelopes, new HashMap<>()) - 1;
  }

  public int maxEnvelopes(
    int[] envelope,
    int[][] envelopes,
    HashMap<String, Integer> map
  ) {
    String key = Arrays.toString(envelope);
    if (map.containsKey(key)) {
      return map.get(key);
    }
    int res = 1;
    for (int[] e : envelopes) {
      if (isLargeThan(e, envelope)) {
        res = Math.max(res, 1 + maxEnvelopes(e, envelopes, map));
      }
    }
    map.put(key, res);
    return res;
  }

  private boolean isLargeThan(int[] e1, int[] e2) {
    return e1[0] > e2[0] && e1[1] > e2[1];
  }
}
