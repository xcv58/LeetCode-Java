package com.xcv58.leetcode.nth_magical_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(2, solution.nthMagicalNumber(1, 2, 3));
    assertEquals(6, solution.nthMagicalNumber(4, 2, 3));
    assertEquals(10, solution.nthMagicalNumber(5, 2, 4));
    assertEquals(8, solution.nthMagicalNumber(3, 6, 4));
    assertEquals(
      999720007,
      solution.nthMagicalNumber(1000000000, 40000, 40000)
    );
    assertEquals(147483633, solution.nthMagicalNumber(Integer.MAX_VALUE, 1, 2));
    assertEquals(
      516017395,
      solution.nthMagicalNumber(Integer.MAX_VALUE, 1007, Integer.MAX_VALUE)
    );
    assertEquals(
      944357712,
      solution.nthMagicalNumber(
        Integer.MAX_VALUE,
        (1 << 20) + 1,
        Integer.MAX_VALUE
      )
    );
  }
}
