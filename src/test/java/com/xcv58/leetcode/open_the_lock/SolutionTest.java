package com.xcv58.leetcode.open_the_lock;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(4, solution.openLock(new String[] { "0101" }, "0202"));
    assertEquals(
      -1,
      solution.openLock(
        new String[] {
          "8887",
          "8889",
          "8878",
          "8898",
          "8788",
          "8988",
          "7888",
          "9888",
        },
        "8888"
      )
    );
    assertEquals(
      -1,
      solution.openLock(
        new String[] {
          "0001",
          "0009",
          "0010",
          "0090",
          "0100",
          "0900",
          "1000",
          "9000",
        },
        "8888"
      )
    );
    assertEquals(
      -1,
      solution.openLock(
        new String[] {
          "0001",
          "0009",
          "0010",
          "0090",
          "0100",
          "0900",
          "1000",
          "9000",
        },
        "9999"
      )
    );
  }
}
