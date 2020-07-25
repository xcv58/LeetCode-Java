package com.xcv58.leetcode.length_of_longest_fibonacci_subsequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.lenLongestFibSubseq(null));
    assertEquals(0, solution.lenLongestFibSubseq(new int[] {}));
    assertEquals(0, solution.lenLongestFibSubseq(new int[] { 0, 1 }));
    assertEquals(0, solution.lenLongestFibSubseq(new int[] { 0, 1, 2 }));
    assertEquals(0, solution.lenLongestFibSubseq(new int[] { 0, 1, 2, 4 }));
    assertEquals(3, solution.lenLongestFibSubseq(new int[] { 0, 1, 1 }));
    assertEquals(3, solution.lenLongestFibSubseq(new int[] { 1, 1, 2 }));
    assertEquals(0, solution.lenLongestFibSubseq(new int[] { 1, 1, 3 }));
    assertEquals(
      5,
      solution.lenLongestFibSubseq(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 })
    );
    assertEquals(
      3,
      solution.lenLongestFibSubseq(new int[] { 1, 3, 7, 11, 12, 14, 18 })
    );
    assertEquals(
      5,
      solution.lenLongestFibSubseq(
        new int[] { 2, 4, 7, 8, 9, 10, 14, 15, 18, 23, 32, 50 }
      )
    );
  }
}
