package com.xcv58.leetcode.next_permutation;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void test() {
    test(null, null);
    test(new int[] {}, new int[] {});
    test(new int[] { 1 }, new int[] { 1 });
    test(new int[] { 2, 1 }, new int[] { 1, 2 });
    test(new int[] { 1, 2, 4, 3, 5 }, new int[] { 1, 2, 3, 5, 4 });
    test(new int[] { 1, 2, 3, 5, 4 }, new int[] { 1, 2, 3, 4, 5 });
    test(
      new int[] { 1, 2, 3, 10, 7, 8, 9, 9, 48, 49, 50 },
      new int[] { 1, 2, 3, 9, 50, 49, 48, 10, 9, 8, 7 }
    );
  }

  private void test(int[] expected, int[] target) {
    solution.nextPermutation(target);
    assertArrayEquals(expected, target);
  }
}
