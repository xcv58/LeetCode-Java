package com.xcv58.leetcode.construct_the_rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.constructRectangle(0));
    assertEquals(null, solution.constructRectangle(-1));
    assertEquals(null, solution.constructRectangle(-100));
    assertArrayEquals(new int[] { 1, 1 }, solution.constructRectangle(1));
    assertArrayEquals(new int[] { 11, 9 }, solution.constructRectangle(99));
    assertArrayEquals(new int[] { 3, 3 }, solution.constructRectangle(9));
    assertArrayEquals(new int[] { 101, 99 }, solution.constructRectangle(9999));
  }
}
