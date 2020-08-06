package com.xcv58.leetcode.koko_eating_bananas;

public class Solution {

  public int minEatingSpeed(int[] piles, int H) {
    if (piles == null || piles.length == 0) {
      return 0;
    }
    int max = Math.max(H, piles[0]);
    for (int pile : piles) {
      max = Math.max(max, pile);
    }
    int i = 1;
    for (int j = max; i < j;) {
      int mid = (i + j) / 2;
      if (canEatAll(piles, H, mid)) {
        j = mid;
      } else {
        i = mid + 1;
      }
    }
    return i;
  }

  private boolean canEatAll(int[] piles, int H, int K) {
    int hours = 0;
    for (int pile : piles) {
      hours += (pile / K) + (pile % K == 0 ? 0 : 1);
    }
    return hours <= H;
  }
}
