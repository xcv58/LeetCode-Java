package com.xcv58.leetcode.frog_jump;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.canCross(null));
    assertEquals(false, solution.canCross(new int[] {}));
    assertEquals(
      true,
      solution.canCross(new int[] { 0, 1, 3, 5, 6, 8, 12, 17 })
    );
    assertEquals(
      false,
      solution.canCross(new int[] { 0, 1, 2, 3, 4, 8, 9, 11 })
    );
    assertEquals(
      false,
      solution.canCross(new int[] { 0, 1, 3, 5, 6, 8, 12, 17, 25 })
    );
    assertEquals(
      true,
      solution.canCross(new int[] { 0, 1, 3, 6, 10, 15, 21, 28 })
    );
    assertEquals(
      true,
      solution.canCross(new int[] { 0, 1, 3, 6, 10, 15, 21, 28, 36 })
    );
    assertEquals(
      false,
      solution.canCross(new int[] { 0, 1, 3, 6, 10, 15, 21, 28, 36, 37 })
    );
    assertEquals(
      true,
      solution.canCross(new int[] { 0, 1, 3, 6, 10, 15, 21, 28, 36, 45 })
    );
    int[] arr = new int[100_000];
    for (int i = 0, tmp = 0, delta = 1; i < 100_000; i++) {
      arr[i] = tmp;
      tmp += delta;
      delta++;
    }
    assertEquals(true, solution.canCross(arr));
    arr = new int[1_000_000];
    for (int i = 0, tmp = 0, delta = 1; i < 1_000_000; i++) {
      arr[i] = tmp;
      tmp += delta;
      delta++;
    }
    assertEquals(true, solution.canCross(arr));
    arr[999_999] = Integer.MAX_VALUE;
    assertEquals(false, solution.canCross(arr));
  }
}
