package com.xcv58.leetcode.powerful_integers;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(2), solution.powerfulIntegers(1, 1, 10));
    assertEquals(
      Arrays.asList(2, 3, 5, 9),
      solution.powerfulIntegers(1, 2, 10)
    );
    assertEquals(Arrays.asList(2, 4, 10), solution.powerfulIntegers(1, 3, 10));
    assertEquals(
      Arrays.asList(2, 3, 4, 5, 7, 9, 10),
      solution.powerfulIntegers(2, 3, 10)
    );
    assertEquals(
      Arrays.asList(2, 3, 5, 6, 8, 9),
      solution.powerfulIntegers(2, 4, 10)
    );
    assertEquals(
      Arrays.asList(1680, 8000, 81, 6401, 1601, 2, 120, 6440, 41),
      solution.powerfulIntegers(40, 80, 10000)
    );
  }
}
