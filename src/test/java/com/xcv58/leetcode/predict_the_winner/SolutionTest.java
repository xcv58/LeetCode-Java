package com.xcv58.leetcode.predict_the_winner;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.PredictTheWinner(new int[] { 0 }));
    assertEquals(true, solution.PredictTheWinner(new int[] { 1 }));
    assertEquals(true, solution.PredictTheWinner(new int[] { 100 }));
    assertEquals(true, solution.PredictTheWinner(new int[] { 100, 99 }));
    assertEquals(true, solution.PredictTheWinner(new int[] { 1, 2, 3 }));
    assertEquals(true, solution.PredictTheWinner(new int[] { 1, 2, 233, 232 }));
    assertEquals(
      false,
      solution.PredictTheWinner(new int[] { 1, 2, 233, 100, 100 })
    );
  }
}
