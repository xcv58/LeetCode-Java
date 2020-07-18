package com.xcv58.leetcode.number_of_steps_to_reduce_a_number_to_zero;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numberOfSteps(0));
    assertEquals(1, solution.numberOfSteps(1));
    assertEquals(2, solution.numberOfSteps(2));
    assertEquals(3, solution.numberOfSteps(3));
    assertEquals(3, solution.numberOfSteps(4));
    assertEquals(4, solution.numberOfSteps(5));
    assertEquals(4, solution.numberOfSteps(6));
    assertEquals(5, solution.numberOfSteps(7));
    assertEquals(4, solution.numberOfSteps(8));
    assertEquals(5, solution.numberOfSteps(9));
    assertEquals(5, solution.numberOfSteps(10));
    assertEquals(6, solution.numberOfSteps(11));
    assertEquals(5, solution.numberOfSteps(12));
    assertEquals(6, solution.numberOfSteps(13));
    assertEquals(6, solution.numberOfSteps(14));
    assertEquals(7, solution.numberOfSteps(15));
    assertEquals(5, solution.numberOfSteps(16));
    assertEquals(6, solution.numberOfSteps(17));
    assertEquals(6, solution.numberOfSteps(18));
    assertEquals(7, solution.numberOfSteps(19));
    assertEquals(6, solution.numberOfSteps(20));
    assertEquals(7, solution.numberOfSteps(21));
    assertEquals(7, solution.numberOfSteps(22));
    assertEquals(8, solution.numberOfSteps(23));
    assertEquals(6, solution.numberOfSteps(24));
    assertEquals(7, solution.numberOfSteps(25));
    assertEquals(7, solution.numberOfSteps(26));
    assertEquals(8, solution.numberOfSteps(27));
    assertEquals(7, solution.numberOfSteps(28));
    assertEquals(8, solution.numberOfSteps(29));
    assertEquals(8, solution.numberOfSteps(30));
    assertEquals(9, solution.numberOfSteps(31));
    assertEquals(6, solution.numberOfSteps(32));
    assertEquals(61, solution.numberOfSteps(Integer.MAX_VALUE));
    assertEquals(60, solution.numberOfSteps(Integer.MAX_VALUE - 1));
  }
}
