package com.xcv58.leetcode.bulb_switcher_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(1, solution.flipLights(1, 0));
    assertEquals(2, solution.flipLights(1, 1));
    assertEquals(2, solution.flipLights(1, 1));
    assertEquals(2, solution.flipLights(1, 2));
    assertEquals(2, solution.flipLights(1, 100));
    assertEquals(1, solution.flipLights(2, 0));
    assertEquals(3, solution.flipLights(2, 1));
    assertEquals(4, solution.flipLights(2, 2));
    assertEquals(4, solution.flipLights(2, 3));
    assertEquals(4, solution.flipLights(2, 10));
    assertEquals(4, solution.flipLights(3, 1));
    assertEquals(7, solution.flipLights(3, 2));
    assertEquals(8, solution.flipLights(3, 3));
    assertEquals(4, solution.flipLights(30, 1));
    assertEquals(7, solution.flipLights(30, 2));
    assertEquals(8, solution.flipLights(30, 3));
    assertEquals(1, solution.flipLights(7, 0));
    assertEquals(4, solution.flipLights(7, 1));
    assertEquals(7, solution.flipLights(7, 2));
    assertEquals(8, solution.flipLights(7, 3));
    assertEquals(8, solution.flipLights(7, 4));
    assertEquals(8, solution.flipLights(7, 5));
    assertEquals(8, solution.flipLights(7, 6));
    assertEquals(8, solution.flipLights(7, 7));
    assertEquals(8, solution.flipLights(7, 8));
    assertEquals(8, solution.flipLights(7, 9));
    assertEquals(8, solution.flipLights(7, 1000));
    assertEquals(8, solution.flipLights(9, 9));
    assertEquals(8, solution.flipLights(10, 9));
    assertEquals(8, solution.flipLights(10, 100));
    assertEquals(8, solution.flipLights(100, 100));
  }
}
