package com.xcv58.leetcode.kth_smallest_number_in_multiplication_table;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(1, solution.findKthNumber(3, 3, 1));
    assertEquals(2, solution.findKthNumber(3, 3, 2));
    assertEquals(2, solution.findKthNumber(3, 3, 3));
    assertEquals(3, solution.findKthNumber(3, 3, 4));
    assertEquals(3, solution.findKthNumber(3, 3, 5));
    assertEquals(4, solution.findKthNumber(3, 3, 6));
    assertEquals(6, solution.findKthNumber(3, 3, 7));
    assertEquals(6, solution.findKthNumber(3, 3, 8));
    assertEquals(9, solution.findKthNumber(3, 3, 9));
    assertEquals(1, solution.findKthNumber(2, 3, 1));
    assertEquals(2, solution.findKthNumber(2, 3, 2));
    assertEquals(2, solution.findKthNumber(2, 3, 3));
    assertEquals(3, solution.findKthNumber(2, 3, 4));
    assertEquals(4, solution.findKthNumber(2, 3, 5));
    assertEquals(6, solution.findKthNumber(2, 3, 6));
    assertEquals(1, solution.findKthNumber(100, 100, 1));
    assertEquals(10000, solution.findKthNumber(100, 100, 10000));
    assertEquals(105, solution.findKthNumber(100, 100, 500));
    assertEquals(9900, solution.findKthNumber(100, 100, 9999));
    assertEquals(31666344, solution.findKthNumber(9895, 28405, 100787757));
  }
}
