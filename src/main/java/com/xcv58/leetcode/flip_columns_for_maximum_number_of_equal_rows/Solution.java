package com.xcv58.leetcode.flip_columns_for_maximum_number_of_equal_rows;

import java.util.*;

public class Solution {

  public int maxEqualRowsAfterFlips(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return 0;
    }
    HashMap<String, Integer> map = new HashMap<>();
    for (int[] row : matrix) {
      String key = getKey(row);
      Integer count = map.getOrDefault(key, 0);
      map.put(key, count + 1);
    }
    int max = 0;
    for (Integer count : map.values()) {
      max = Math.max(count, max);
    }
    return max;
  }

  private String getKey(int[] row) {
    if (row == null || row.length == 0) {
      return "";
    }
    boolean reverse = row[0] == 0;
    String res = "";
    for (int cell : row) {
      if (reverse) {
        res += cell ^ 1;
      } else {
        res += cell;
      }
    }
    return res;
  }
}
