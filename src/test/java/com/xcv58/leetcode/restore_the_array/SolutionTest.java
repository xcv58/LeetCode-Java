package com.xcv58.leetcode.restore_the_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numberOfArrays(null, 1));
    assertEquals(0, solution.numberOfArrays("", 1));
    assertEquals(1, solution.numberOfArrays("1", 1));
    assertEquals(0, solution.numberOfArrays("9", 1));
    assertEquals(1, solution.numberOfArrays("1000", 10000));
    assertEquals(1, solution.numberOfArrays("10000", 10000));
    assertEquals(0, solution.numberOfArrays("10000", 1000));
    assertEquals(0, solution.numberOfArrays("10000", 10));
    assertEquals(8, solution.numberOfArrays("1317", 2000));
    assertEquals(7, solution.numberOfArrays("1317", 1000));
    assertEquals(6, solution.numberOfArrays("1317", 300));
    assertEquals(5, solution.numberOfArrays("1317", 100));
    assertEquals(4, solution.numberOfArrays("1317", 20));
    assertEquals(34, solution.numberOfArrays("1234567890", 90));
    assertEquals(512, solution.numberOfArrays("2147483647", Integer.MAX_VALUE));
    assertEquals(511, solution.numberOfArrays("2147483648", Integer.MAX_VALUE));
    assertEquals(511, solution.numberOfArrays("2147483649", Integer.MAX_VALUE));
    assertEquals(500, solution.numberOfArrays("2147483647", 5000000));
    assertEquals(
      77762991,
      solution.numberOfArrays(
        "21474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647",
        Integer.MAX_VALUE
      )
    );
    assertEquals(
      604098695,
      solution.numberOfArrays(
        "21474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647",
        Integer.MAX_VALUE
      )
    );
    assertEquals(
      55859427,
      solution.numberOfArrays(
        "214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647214748364721474836472147483647",
        Integer.MAX_VALUE
      )
    );
  }
}
