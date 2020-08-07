package com.xcv58.leetcode.sum_of_mutated_array_closest_to_target;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.findBestValue(null, 10));
    assertEquals(0, solution.findBestValue(new int[] {}, 10));
    assertEquals(5, solution.findBestValue(new int[] { 2, 3, 5 }, 10));
    assertEquals(
      11361,
      solution.findBestValue(
        new int[] { 60864, 25176, 27249, 21296, 20204 },
        56803
      )
    );
    assertEquals(
      17422,
      solution.findBestValue(
        new int[] { 1547, 83230, 57084, 93444, 70879 },
        71237
      )
    );
    assertEquals(3, solution.findBestValue(new int[] { 4, 9, 3 }, 10));
  }
}
