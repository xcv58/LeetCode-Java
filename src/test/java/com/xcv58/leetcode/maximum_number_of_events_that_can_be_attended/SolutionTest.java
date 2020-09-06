package com.xcv58.leetcode.maximum_number_of_events_that_can_be_attended;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxEvents(null));
    assertEquals(0, solution.maxEvents(new int[][] {}));
    assertEquals(1, solution.maxEvents(new int[][] { { 1, 1 } }));
    assertEquals(2, solution.maxEvents(new int[][] { { 1, 1 }, { 1, 2 } }));
    assertEquals(
      3,
      solution.maxEvents(new int[][] { { 1, 1 }, { 1, 2 }, { 2, 3 } })
    );
    assertEquals(
      5,
      solution.maxEvents(
        new int[][] {
          { 1, 1 },
          { 1, 2 },
          { 1, 3 },
          { 1, 4 },
          { 1, 5 },
          { 2, 2 },
          { 3, 3 },
        }
      )
    );
    assertEquals(
      5,
      solution.maxEvents(
        new int[][] { { 1, 1 }, { 1, 4 }, { 1, 5 }, { 2, 2 }, { 3, 3 } }
      )
    );
    assertEquals(
      5,
      solution.maxEvents(
        new int[][] {
          { 1, 1 },
          { 1, 4 },
          { 1, 5 },
          { 2, 3 },
          { 2, 2 },
          { 2, 2 },
          { 2, 2 },
          { 2, 2 },
          { 2, 2 },
          { 3, 3 },
        }
      )
    );
    assertEquals(
      8,
      solution.maxEvents(
        new int[][] {
          { 1, 10 },
          { 1, 2 },
          { 1, 4 },
          { 1, 5 },
          { 2, 3 },
          { 2, 2 },
          { 2, 2 },
          { 2, 2 },
          { 2, 2 },
          { 2, 2 },
          { 10, 10 },
          { 100, 200 },
          { 3, 3 },
        }
      )
    );
  }
}
