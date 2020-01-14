package com.xcv58.leetcode.convert_integer_to_the_sum_of_two_no_zero_integers;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    for (int i = 2; i < 1000000; i++) {
      isValidSolution(solution.getNoZeroIntegers(i), i);
    }
  }

  private void isValidSolution(int[] res, int n) {
    assertEquals(res.length, 2);
    assertEquals(res[0] + res[1], n);
    noZeroNumber(res[0]);
    noZeroNumber(res[1]);
  }

  private void noZeroNumber(int n) {
    assertEquals(n > 0, true);
    while (n > 0) {
      assertEquals(n % 10 != 0, true);
      n /= 10;
    }
  }
}
