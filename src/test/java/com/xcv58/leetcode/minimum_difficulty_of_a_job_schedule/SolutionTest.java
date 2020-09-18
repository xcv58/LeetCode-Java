package com.xcv58.leetcode.minimum_difficulty_of_a_job_schedule;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(-1, solution.minDifficulty(null, 2));
    assertEquals(-1, solution.minDifficulty(new int[] {}, 2));
    assertEquals(7, solution.minDifficulty(new int[] { 6, 5, 4, 3, 2, 1 }, 2));
    assertEquals(
      15,
      solution.minDifficulty(new int[] { 6, 5, 4, 3, 2, 1, 9 }, 2)
    );
    assertEquals(-1, solution.minDifficulty(new int[] { 9, 9, 9 }, 4));
    assertEquals(-1, solution.minDifficulty(new int[] { 1, 1, 1 }, 4));
    assertEquals(3, solution.minDifficulty(new int[] { 1, 1, 1, 1 }, 3));
    assertEquals(3, solution.minDifficulty(new int[] { 1, 1, 1 }, 3));
    assertEquals(7, solution.minDifficulty(new int[] { 7, 1, 7, 1, 7, 1 }, 1));
    assertEquals(8, solution.minDifficulty(new int[] { 7, 1, 7, 1, 7, 1 }, 2));
    assertEquals(15, solution.minDifficulty(new int[] { 7, 1, 7, 1, 7, 1 }, 3));
    assertEquals(16, solution.minDifficulty(new int[] { 7, 1, 7, 1, 7, 1 }, 4));
    assertEquals(23, solution.minDifficulty(new int[] { 7, 1, 7, 1, 7, 1 }, 5));
    assertEquals(24, solution.minDifficulty(new int[] { 7, 1, 7, 1, 7, 1 }, 6));
    assertEquals(-1, solution.minDifficulty(new int[] { 7, 1, 7, 1, 7, 1 }, 7));
  }
}
