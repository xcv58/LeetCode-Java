package com.xcv58.leetcode.grumpy_bookstore_owner;

public class Solution {

  public int maxSatisfied(int[] customers, int[] grumpy, int X) {
    if (customers == null || grumpy == null) {
      return 0;
    }
    int sum = 0;
    for (int i = 0; i < customers.length; i++) {
      if (grumpy[i] == 0) {
        sum += customers[i];
      }
    }
    int maxSaved = 0;
    for (int i = 0, count = 0, saved = 0; i < customers.length; i++) {
      if (grumpy[i] == 1) {
        saved += customers[i];
      }
      if (count < X) {
        count++;
      } else {
        if (grumpy[i - X] == 1) {
          saved -= customers[i - X];
        }
      }
      maxSaved = Math.max(maxSaved, saved);
    }
    return sum + maxSaved;
  }
}
