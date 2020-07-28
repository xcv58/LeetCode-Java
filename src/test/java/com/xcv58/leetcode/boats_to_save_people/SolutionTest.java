package com.xcv58.leetcode.boats_to_save_people;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numRescueBoats(null, 2));
    assertEquals(2, solution.numRescueBoats(new int[] { 1, 2 }, 2));
    assertEquals(1, solution.numRescueBoats(new int[] { 1, 2 }, 3));
    assertEquals(3, solution.numRescueBoats(new int[] { 3, 2, 1, 2 }, 3));
    assertEquals(4, solution.numRescueBoats(new int[] { 3, 5, 3, 4 }, 5));
    assertEquals(3, solution.numRescueBoats(new int[] { 3, 5, 3, 4 }, 6));
  }
}
