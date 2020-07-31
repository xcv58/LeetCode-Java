package com.xcv58.leetcode.minimum_cost_for_tickets;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      6,
      solution.mincostTickets(
        new int[] { 4, 5, 9, 11, 14, 16 },
        new int[] { 1, 4, 18 }
      )
    );
    assertEquals(
      7,
      solution.mincostTickets(
        new int[] { 4, 5, 9, 11, 14, 16, 17 },
        new int[] { 1, 4, 18 }
      )
    );
    assertEquals(
      8,
      solution.mincostTickets(
        new int[] { 4, 5, 9, 11, 14, 16, 17, 19 },
        new int[] { 1, 4, 18 }
      )
    );
    assertEquals(
      9,
      solution.mincostTickets(
        new int[] { 4, 5, 9, 11, 14, 16, 17, 19, 21 },
        new int[] { 1, 4, 18 }
      )
    );
    assertEquals(
      9,
      solution.mincostTickets(
        new int[] { 4, 5, 9, 11, 14, 16, 17, 19, 21, 22 },
        new int[] { 1, 4, 18 }
      )
    );
    assertEquals(
      10,
      solution.mincostTickets(
        new int[] { 4, 5, 9, 11, 14, 16, 17, 19, 21, 22, 23 },
        new int[] { 1, 4, 18 }
      )
    );
    assertEquals(
      11,
      solution.mincostTickets(
        new int[] { 4, 5, 9, 11, 14, 16, 17, 19, 21, 22, 23, 24 },
        new int[] { 1, 4, 18 }
      )
    );
    assertEquals(
      10,
      solution.mincostTickets(
        new int[] { 4, 5, 9, 11, 14, 16, 17, 19, 21, 22, 24 },
        new int[] { 1, 4, 18 }
      )
    );
    assertEquals(
      17,
      solution.mincostTickets(
        new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31 },
        new int[] { 2, 7, 15 }
      )
    );
    assertEquals(0, solution.mincostTickets(null, new int[] { 2, 7, 15 }));
    assertEquals(
      0,
      solution.mincostTickets(new int[] {}, new int[] { 2, 7, 15 })
    );
    assertEquals(
      2,
      solution.mincostTickets(new int[] { 1 }, new int[] { 2, 7, 15 })
    );
    assertEquals(
      11,
      solution.mincostTickets(
        new int[] { 1, 4, 6, 7, 8, 20 },
        new int[] { 2, 7, 15 }
      )
    );
  }
}
