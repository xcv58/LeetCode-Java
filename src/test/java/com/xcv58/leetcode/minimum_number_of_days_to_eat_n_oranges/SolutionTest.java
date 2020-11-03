package com.xcv58.leetcode.minimum_number_of_days_to_eat_n_oranges;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minDays(0));
    assertEquals(1, solution.minDays(1));
    assertEquals(2, solution.minDays(2));
    assertEquals(2, solution.minDays(3));
    assertEquals(3, solution.minDays(4));
    assertEquals(4, solution.minDays(5));
    assertEquals(3, solution.minDays(6));
    assertEquals(4, solution.minDays(7));
    assertEquals(4, solution.minDays(8));
    assertEquals(3, solution.minDays(9));
    assertEquals(4, solution.minDays(10));
    assertEquals(5, solution.minDays(11));
    assertEquals(4, solution.minDays(12));
    assertEquals(8, solution.minDays(100));
    assertEquals(22, solution.minDays(820592));
    assertEquals(15, solution.minDays(Integer.MAX_VALUE / 1000000));
    assertEquals(35, solution.minDays(Integer.MAX_VALUE));
  }
}
