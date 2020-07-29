package com.xcv58.leetcode.find_the_smallest_divisor_given_a_threshold;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(5, solution.smallestDivisor(new int[] { 1, 2, 5, 9 }, 6));
    assertEquals(3, solution.smallestDivisor(new int[] { 2, 3, 5, 7, 11 }, 11));
    assertEquals(4, solution.smallestDivisor(new int[] { 19 }, 5));
    assertEquals(
      495280,
      solution.smallestDivisor(
        new int[] { 962551, 933661, 905225, 923035, 990560 },
        10
      )
    );
    assertEquals(
      4303575,
      solution.smallestDivisor(
        new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, 100, 200 },
        1000
      )
    );
  }
}
