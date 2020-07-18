package com.xcv58.leetcode.corporate_flight_bookings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      new int[] { 10, 55, 45, 25, 25 },
      solution.corpFlightBookings(
        new int[][] { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } },
        5
      )
    );
    assertArrayEquals(
      new int[] { 10, 55, 45, 25, 25, 0, 0 },
      solution.corpFlightBookings(
        new int[][] { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } },
        7
      )
    );
  }
}
