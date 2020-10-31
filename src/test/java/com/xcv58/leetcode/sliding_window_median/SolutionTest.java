package com.xcv58.leetcode.sliding_window_median;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.medianSlidingWindow(null, 1));
    assertEquals(null, solution.medianSlidingWindow(new int[] {}, 1));
    assertEquals(null, solution.medianSlidingWindow(new int[] { 1 }, 2));
    assertTrue(
      Arrays.equals(
        new double[] { 1.0, 3.0, -1.0, -3.0, 5.0, 3.0, 6.0, 7.0 },
        solution.medianSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 1)
      )
    );
    assertTrue(
      Arrays.equals(
        new double[] { 2.0, 1.0, -2.0, 1.0, 4.0, 4.5, 6.5 },
        solution.medianSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 2)
      )
    );
    assertTrue(
      Arrays.equals(
        new double[] { 1.0, -1.0, -1.0, 3.0, 5.0, 6.0 },
        solution.medianSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3)
      )
    );
    assertTrue(
      Arrays.equals(
        new double[] { 2.0, 3.0, 3.0, 3.0, 2.0, 3.0, 2.0 },
        solution.medianSlidingWindow(new int[] { 1, 2, 3, 4, 2, 3, 1, 4, 2 }, 3)
      )
    );
    assertTrue(
      Arrays.equals(
        new double[] { 2147483647.00000 },
        solution.medianSlidingWindow(new int[] { 2147483647, 2147483647 }, 2)
      )
    );
    assertTrue(
      Arrays.equals(
        new double[] { -0.5 },
        solution.medianSlidingWindow(new int[] { 2147483647, -2147483648 }, 2)
      )
    );
  }
}
