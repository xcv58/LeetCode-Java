package com.xcv58.leetcode.number_of_dice_rolls_with_target_sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(6, solution.numRollsToTarget(2, 6, 7));
    assertEquals(222616187, solution.numRollsToTarget(30, 30, 500));
  }
}
