package com.xcv58.leetcode.first_bad_version;

/**
 * Created by xcv58 on 10/17/15.
 * The isBadVersion API is defined in the parent class VersionControl.
 * boolean isBadVersion(int version);
 */
public class Solution extends VersionControl {

  public int firstBadVersion(int n) {
    int i = 1;
    for (int m = i + (n - i) / 2; n > i; m = i + (n - i) / 2) {
      if (isBadVersion(m)) {
        if (i == m) {
          break;
        }
        n = m;
      } else {
        i = m + 1;
      }
    }
    return i;
  }
}
