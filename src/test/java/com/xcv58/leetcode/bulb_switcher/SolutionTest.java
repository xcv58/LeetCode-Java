package com.xcv58.leetcode.bulb_switcher;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(1, solution.bulbSwitch(1));
    assertEquals(1, solution.bulbSwitch(2));
    assertEquals(1, solution.bulbSwitch(3));
    assertEquals(2, solution.bulbSwitch(4));
    assertEquals(2, solution.bulbSwitch(5));
    assertEquals(2, solution.bulbSwitch(6));
    assertEquals(2, solution.bulbSwitch(7));
    assertEquals(2, solution.bulbSwitch(8));
    assertEquals(3, solution.bulbSwitch(9));
    assertEquals(46340, solution.bulbSwitch(Integer.MAX_VALUE));
  }
}
