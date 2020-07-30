package com.xcv58.leetcode.three_equal_parts;

import java.util.*;

public class Solution {

  public int[] threeEqualParts(int[] A) {
    if (A == null || A.length < 3) {
      return new int[] { -1, -1 };
    }
    int[] ones = new int[A.length];
    for (int i = 0, count = 0; i < A.length; i++) {
      if (A[i] == 1) {
        count++;
      }
      ones[i] = count;
    }
    int total = ones[A.length - 1];
    if (total % 3 != 0) {
      return new int[] { -1, -1 };
    }
    int partLen = total / 3;
    if (partLen == 0) {
      return new int[] { 0, A.length - 1 };
    }
    int[] divider1 = findRange(ones, partLen);
    int[] divider2 = findRange(ones, 2 * partLen);
    for (int i = divider1[0]; i < divider1[1]; i++) {
      for (int j = divider2[0] + 1; j <= divider2[1]; j++) {
        if (isEqualDivision(A, i, j)) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] { -1, -1 };
  }

  private int[] findRange(int[] ones, int size) {
    int[] res = new int[] { -1, -1 };
    for (int i = 0; i < ones.length; i++) {
      if (ones[i] == size) {
        if (res[0] == -1) {
          res[0] = i;
        }
      }
      if (ones[i] > size) {
        res[1] = i;
        break;
      }
    }
    return res;
  }

  private boolean isEqualDivision(int[] A, int a, int b) {
    int i1 = findNonZeroIndex(A, 0, a + 1);
    int i2 = findNonZeroIndex(A, a + 1, b);
    int i3 = findNonZeroIndex(A, b, A.length);
    for (; true; i1++, i2++, i3++) {
      if (i1 == a + 1 && i2 == b && i3 == A.length) {
        return true;
      }
      if (i1 == a + 1 || i2 == b || i3 == A.length) {
        return false;
      }
      if (A[i1] != A[i2] || A[i2] != A[i3]) {
        return false;
      }
    }
  }

  private int findNonZeroIndex(int[] A, int start, int end) {
    for (int i = start; i < end; i++) {
      if (A[i] != 0) {
        return i;
      }
    }
    return end;
  }
}
