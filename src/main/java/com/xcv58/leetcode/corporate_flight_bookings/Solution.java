package com.xcv58.leetcode.corporate_flight_bookings;

public class Solution {

  public int[] corpFlightBookings(int[][] bookings, int n) {
    int[] res = new int[n];
    if (bookings == null) {
      return res;
    }
    for (int[] booking : bookings) {
      int i = booking[0];
      int j = booking[1];
      int k = booking[2];
      for (int m = i; m <= j; m++) {
        res[m - 1] += k;
      }
    }
    return res;
  }
}
