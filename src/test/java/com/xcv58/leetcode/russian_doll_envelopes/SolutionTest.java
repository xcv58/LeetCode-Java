package com.xcv58.leetcode.russian_doll_envelopes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(2, solution.maxEnvelopes(new int[][] { { 1, 1 }, { 2, 2 } }));
    assertEquals(
      3,
      solution.maxEnvelopes(
        new int[][] { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } }
      )
    );
    assertEquals(
      4,
      solution.maxEnvelopes(
        new int[][] {
          { 5, 4 },
          { 6, 4 },
          { 6, 7 },
          { 7, 2 },
          { 7, 8 },
          { 7, 9 },
          { 2, 3 },
        }
      )
    );
  }
}
