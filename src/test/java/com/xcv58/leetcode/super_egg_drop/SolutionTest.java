package com.xcv58.leetcode.super_egg_drop;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(2, solution.superEggDrop(2, 2));
    assertEquals(2, solution.superEggDrop(2, 3));
    assertEquals(3, solution.superEggDrop(2, 4));
    assertEquals(3, solution.superEggDrop(2, 5));
    assertEquals(3, solution.superEggDrop(2, 6));
    assertEquals(4, solution.superEggDrop(2, 7));
    assertEquals(4, solution.superEggDrop(2, 8));
    assertEquals(4, solution.superEggDrop(2, 9));
    assertEquals(4, solution.superEggDrop(2, 10));
    assertEquals(5, solution.superEggDrop(2, 11));
    assertEquals(5, solution.superEggDrop(2, 15));
    assertEquals(6, solution.superEggDrop(2, 16));
    assertEquals(45, solution.superEggDrop(2, 1024));
    assertEquals(19, solution.superEggDrop(3, 1024));
    assertEquals(13, solution.superEggDrop(4, 1024));
    assertEquals(12, solution.superEggDrop(5, 1024));
    assertEquals(11, solution.superEggDrop(6, 1024));
    assertEquals(11, solution.superEggDrop(7, 1024));
    assertEquals(11, solution.superEggDrop(8, 1024));
    assertEquals(11, solution.superEggDrop(9, 1024));
    assertEquals(11, solution.superEggDrop(10, 1024));
    assertEquals(11, solution.superEggDrop(11, 1024));
    assertEquals(2, solution.superEggDrop(10, 2));
    assertEquals(2, solution.superEggDrop(10, 3));
    assertEquals(3, solution.superEggDrop(10, 4));
    assertEquals(3, solution.superEggDrop(10, 5));
    assertEquals(3, solution.superEggDrop(10, 6));
    assertEquals(3, solution.superEggDrop(10, 7));
    assertEquals(4, solution.superEggDrop(10, 8));
    assertEquals(4, solution.superEggDrop(10, 9));
    assertEquals(4, solution.superEggDrop(10, 10));
    assertEquals(4, solution.superEggDrop(10, 11));
    assertEquals(10, solution.superEggDrop(1, 10));
    assertEquals(4, solution.superEggDrop(3, 14));
    assertEquals(3, solution.superEggDrop(2, 6));
    assertEquals(7, solution.superEggDrop(10, 100));
    assertEquals(14, solution.superEggDrop(2, 100));
    assertEquals(11, solution.superEggDrop(100, 1024));
    assertEquals(19, solution.superEggDrop(4, 5000));
    assertEquals(23, solution.superEggDrop(4, 10000));
    assertEquals(40, solution.superEggDrop(4, 100000));
    assertEquals(60, solution.superEggDrop(4, 500000));
    assertEquals(477, solution.superEggDrop(4, Integer.MAX_VALUE));
    assertEquals(49, solution.superEggDrop(9, Integer.MAX_VALUE));
    assertEquals(31, solution.superEggDrop(200, Integer.MAX_VALUE));
    assertEquals(31, solution.superEggDrop(1024 * 1024, Integer.MAX_VALUE));
  }
}
