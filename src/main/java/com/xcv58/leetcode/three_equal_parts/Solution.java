package com.xcv58.leetcode.three_equal_parts;

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
    int[] range1 = findRange(ones, partLen);
    int[] range2 = findRange(ones, 2 * partLen);
    int[] range3 = findRange(ones, 3 * partLen);
    if (range3[2] > range2[2] || range3[2] > range1[2]) {
      System.out.println("Fail fast");
      return new int[] { -1, -1 };
    }
    int i = range1[0] + range3[2];
    int j = range2[0] + 1 + range3[2];
    if (isEqualDivision(A, i, j)) {
      return new int[] { i, j };
    }
    return new int[] { -1, -1 };
  }

  private int[] findRange(int[] ones, int size) {
    int[] res = new int[] { -1, -1, -1 };
    for (int i = 0; i < ones.length; i++) {
      if (ones[i] == size) {
        res[1] = i;
        if (res[0] == -1) {
          res[0] = i;
        }
      }
      if (ones[i] > size) {
        break;
      }
    }
    res[2] = res[1] - res[0];
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
