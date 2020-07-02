package com.xcv58.leetcode.minimum_absolute_difference;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      Arrays.asList(
        Arrays.asList(1, 2),
        Arrays.asList(2, 3),
        Arrays.asList(3, 4)
      ),
      solution.minimumAbsDifference(new int[] { 2, 3, 1, 4 })
    );
    assertEquals(
      Arrays.asList(
        Arrays.asList(-14, -10),
        Arrays.asList(19, 23),
        Arrays.asList(23, 27)
      ),
      solution.minimumAbsDifference(
        new int[] { 3, 8, -10, 23, 19, -4, -14, 27 }
      )
    );
  }
}
