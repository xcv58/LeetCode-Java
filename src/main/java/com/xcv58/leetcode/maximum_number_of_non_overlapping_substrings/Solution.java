package com.xcv58.leetcode.maximum_number_of_non_overlapping_substrings;

import java.util.*;

public class Solution {

  public List<String> maxNumOfSubstrings(String s) {
    if (s == null) {
      return null;
    }
    int[] left = new int[26];
    int[] right = new int[26];
    Arrays.fill(left, -1);
    Arrays.fill(right, -1);
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      int index = chars[i] - 'a';
      if (left[index] == -1) {
        left[index] = i;
      }
    }
    for (int i = chars.length - 1; i >= 0; i--) {
      int index = chars[i] - 'a';
      if (right[index] == -1) {
        right[index] = i;
      }
    }

    List<int[]> list = new ArrayList<>();
    for (int i = 0; i < 26; i++) {
      if (left[i] != -1 && right[i] != -1) {
        int leftBound = left[i];
        int rightBound = right[i];
        for (int j = leftBound, k = leftBound; true;) {
          if (j > rightBound && k < leftBound) {
            break;
          }
          int index;
          if (j <= rightBound) {
            index = chars[j] - 'a';
            j++;
          } else {
            index = chars[k] - 'a';
            k--;
          }
          rightBound = Math.max(rightBound, right[index]);
          leftBound = Math.min(leftBound, left[index]);
        }
        list.add(
          new int[] { leftBound, rightBound, rightBound - leftBound + 1 }
        );
      }
    }
    Collections.sort(
      list,
      (r1, r2) -> {
        if (r1[2] != r2[2]) {
          return Integer.compare(r1[2], r2[2]);
        }
        return Integer.compare(r1[0], r2[0]);
      }
    );
    boolean[] taken = new boolean[chars.length];
    List<String> res = new ArrayList<>();
    for (int[] range : list) {
      int start = range[0], end = range[1];
      if (hasNoOverlap(taken, start, end)) {
        for (int i = start; i <= end; i++) {
          taken[i] = true;
        }
        res.add(s.substring(start, end + 1));
      }
    }
    return res;
  }

  private boolean hasNoOverlap(boolean[] taken, int start, int end) {
    for (int i = start; i <= end; i++) {
      if (taken[i]) {
        return false;
      }
    }
    return true;
  }
}
