package com.xcv58.leetcode.number_of_good_pairs;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numIdenticalPairs(null));
    assertEquals(0, solution.numIdenticalPairs(new int[] {}));
    assertEquals(0, solution.numIdenticalPairs(new int[] { 1 }));
    assertEquals(0, solution.numIdenticalPairs(new int[] { 1, 2 }));
    assertEquals(0, solution.numIdenticalPairs(new int[] { 1, 2, 3 }));
    assertEquals(6, solution.numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 1 }));
    assertEquals(
      8,
      solution.numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 1, 2, 3 })
    );
    assertEquals(
      80,
      solution.numIdenticalPairs(
        new int[] { 1, 2, 3, 1, 1, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
      )
    );
  }
}
