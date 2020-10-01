package com.xcv58.leetcode.find_k_pairs_with_smallest_sums;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(List.of(), solution.kSmallestPairs(null, null, 1));
    assertEquals(List.of(), solution.kSmallestPairs(new int[] {}, null, 1));
    assertEquals(List.of(), solution.kSmallestPairs(null, new int[] {}, 1));
    assertEquals(
      List.of(),
      solution.kSmallestPairs(new int[] {}, new int[] {}, 1)
    );
    assertEquals(
      List.of(),
      solution.kSmallestPairs(new int[] { 1, 2, 3, 4 }, new int[] {}, 1)
    );
    assertEquals(
      List.of(List.of(1, 1), List.of(2, 1), List.of(3, 1), List.of(4, 1)),
      solution.kSmallestPairs(new int[] { 1, 2, 3, 4 }, new int[] { 1 }, 10)
    );
    assertEquals(
      List.of(
        List.of(1, 1),
        List.of(1, 1),
        List.of(1, 1),
        List.of(1, 1),
        List.of(1, 1),
        List.of(2, 1),
        List.of(1, 2),
        List.of(2, 1),
        List.of(2, 1),
        List.of(2, 1),
        List.of(2, 1),
        List.of(3, 1),
        List.of(2, 2),
        List.of(3, 1),
        List.of(1, 3),
        List.of(3, 1),
        List.of(3, 1),
        List.of(3, 1),
        List.of(1, 4),
        List.of(3, 2)
      ),
      solution.kSmallestPairs(
        new int[] { 1, 2, 3, 9, 12, 13, 15 },
        new int[] { 1, 1, 1, 1, 1, 2, 3, 4, 6, 8, 9, 11, 15 },
        20
      )
    );
  }
}
