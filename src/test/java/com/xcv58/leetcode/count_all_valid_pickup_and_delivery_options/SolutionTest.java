package com.xcv58.leetcode.count_all_valid_pickup_and_delivery_options;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.countOrders(0));
    assertEquals(1, solution.countOrders(1));
    assertEquals(6, solution.countOrders(2));
    assertEquals(90, solution.countOrders(3));
    assertEquals(2520, solution.countOrders(4));
    assertEquals(113400, solution.countOrders(5));
    assertEquals(7484400, solution.countOrders(6));
    assertEquals(681080400, solution.countOrders(7));
    assertEquals(729647433, solution.countOrders(8));
    assertEquals(636056472, solution.countOrders(9));
    assertEquals(850728840, solution.countOrders(10));
    assertEquals(518360668, solution.countOrders(11));
    assertEquals(14159051, solution.countOrders(100));
    assertEquals(764678010, solution.countOrders(500));
    assertEquals(284746940, solution.countOrders(1000));
    assertEquals(616601443, solution.countOrders(1024));
  }
}
