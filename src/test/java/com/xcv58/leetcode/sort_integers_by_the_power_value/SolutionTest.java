package com.xcv58.leetcode.sort_integers_by_the_power_value;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(1, solution.getKth(1, 10, 1));
    assertEquals(2, solution.getKth(1, 10, 2));
    assertEquals(4, solution.getKth(1, 10, 3));
    assertEquals(8, solution.getKth(1, 10, 4));
    assertEquals(5, solution.getKth(1, 10, 5));
    assertEquals(10, solution.getKth(1, 10, 6));
    assertEquals(3, solution.getKth(1, 10, 7));
    assertEquals(6, solution.getKth(1, 10, 8));
    assertEquals(7, solution.getKth(1, 10, 9));
    assertEquals(9, solution.getKth(1, 10, 10));
    assertEquals(3584, solution.getKth(1, 10000, 500));
    assertEquals(896, solution.getKth(1, 100000, 500));
    assertEquals(32112, solution.getKth(1, 100000, 10000));
  }
}
