package com.xcv58.leetcode.allocate_mailboxes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(9, solution.minDistance(new int[] { 1, 2, 3, 4, 5, 6 }, 1));
    assertEquals(9, solution.minDistance(new int[] { 2, 3, 5, 12, 18 }, 2));
    assertEquals(5, solution.minDistance(new int[] { 1, 4, 8, 10, 20 }, 3));
    assertEquals(25, solution.minDistance(new int[] { 1, 4, 8, 10, 20 }, 1));
    assertEquals(8, solution.minDistance(new int[] { 7, 4, 6, 1 }, 1));
    assertEquals(0, solution.minDistance(new int[] { 3, 6, 14, 10 }, 4));
    assertEquals(4, solution.minDistance(new int[] { 1, 8, 12, 10, 3 }, 3));
    assertEquals(
      57,
      solution.minDistance(
        new int[] {
          1,
          4,
          8,
          10,
          20,
          10,
          1,
          100,
          123,
          13885,
          192391923,
          192391923,
          192391923,
          192391923,
          192391923,
          1293919,
          100,
        },
        5
      )
    );
    assertEquals(
      57,
      solution.minDistance(
        new int[] {
          1,
          4,
          8,
          10,
          20,
          10,
          1,
          100,
          123,
          13885,
          192391923,
          192391923,
          192391923,
          192391923,
          192391923,
          192391923,
          192391923,
          192391923,
          192391923,
          192391923,
          1293919,
          100,
        },
        5
      )
    );
    assertEquals(
      57,
      solution.minDistance(
        new int[] {
          1,
          4,
          8,
          10,
          20,
          10,
          1,
          100,
          123,
          13885,
          192391923,
          1293919,
          1293919,
          1293919,
          1293919,
          1293919,
          1293919,
          1293919,
          1293919,
          1293919,
          1293919,
          1293919,
          1293919,
          100,
        },
        5
      )
    );
    assertEquals(
      57,
      solution.minDistance(
        new int[] {
          1,
          4,
          8,
          10,
          20,
          10,
          1,
          100,
          123,
          13885,
          192391923,
          1293919,
          100,
        },
        5
      )
    );
    assertEquals(
      329,
      solution.minDistance(
        new int[] {
          1,
          4,
          8,
          10,
          20,
          10,
          1,
          100,
          123,
          13885,
          192391923,
          1293919,
          100,
        },
        4
      )
    );
    assertEquals(
      14204,
      solution.minDistance(
        new int[] {
          1,
          4,
          8,
          10,
          20,
          10,
          1,
          100,
          123,
          13885,
          192391923,
          1293919,
          100,
        },
        3
      )
    );
    assertEquals(
      1308113,
      solution.minDistance(
        new int[] {
          1,
          4,
          8,
          10,
          20,
          10,
          1,
          100,
          123,
          13885,
          192391923,
          1293919,
          100,
        },
        2
      )
    );
    assertEquals(
      193700016,
      solution.minDistance(
        new int[] {
          1,
          4,
          8,
          10,
          20,
          10,
          1,
          100,
          123,
          13885,
          192391923,
          1293919,
          100,
        },
        1
      )
    );
  }
}
