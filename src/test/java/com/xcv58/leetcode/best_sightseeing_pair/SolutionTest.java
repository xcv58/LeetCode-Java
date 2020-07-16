package com.xcv58.leetcode.best_sightseeing_pair;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxScoreSightseeingPair(null));
    assertEquals(0, solution.maxScoreSightseeingPair(new int[] {}));
    assertEquals(
      11,
      solution.maxScoreSightseeingPair(new int[] { 8, 1, 5, 2, 6 })
    );
    assertEquals(3, solution.maxScoreSightseeingPair(new int[] { 1, 2, 2 }));
    assertEquals(6, solution.maxScoreSightseeingPair(new int[] { 3, 2, 3, 4 }));
    assertEquals(
      17,
      solution.maxScoreSightseeingPair(new int[] { 7, 8, 8, 10 })
    );
    assertEquals(
      14,
      solution.maxScoreSightseeingPair(new int[] { 7, 2, 6, 6, 9, 4, 3 })
    );
    assertEquals(
      40,
      solution.maxScoreSightseeingPair(
        new int[] { 7, 2, 6, 6, 9, 24, 3, 12, 19 }
      )
    );
  }
}
