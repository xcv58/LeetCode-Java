package com.xcv58.leetcode.first_bad_version;

/**
 * Created by xcv58 on 10/17/15.
 */
public class VersionControl {
  public static int bad = 1;

  protected boolean isBadVersion(int n) {
    return n >= bad;
  }
}
