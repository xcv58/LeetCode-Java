package com.xcv58.leetcode.utf_8_validation;

public class Solution {

  public boolean validUtf8(int[] data) {
    int subBytes = 0;
    for (int d : data) {
      if (subBytes == -1) {
        return false;
      }
      if (subBytes > 0) {
        if ((d >> 6) != 2) {
          return false;
        }
        subBytes--;
      } else {
        subBytes = this.getSubBytes(d);
      }
    }
    return subBytes == 0;
  }

  private int getSubBytes(int b) {
    if ((b & 128) == 0) {
      return 0;
    }
    if ((b & 64) == 0) {
      return -1;
    }
    if ((b & 32) == 0) {
      return 1;
    }
    if ((b & 16) == 0) {
      return 2;
    }
    if ((b & 8) == 0) {
      return 3;
    }
    return -1;
  }
}
