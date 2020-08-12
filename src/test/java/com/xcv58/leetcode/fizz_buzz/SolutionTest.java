package com.xcv58.leetcode.fizz_buzz;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(), solution.fizzBuzz(0));
    assertEquals(Arrays.asList("1"), solution.fizzBuzz(1));
    assertEquals(Arrays.asList("1", "2"), solution.fizzBuzz(2));
    assertEquals(
      Arrays.asList(
        "1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"
      ),
      solution.fizzBuzz(15)
    );
  }
}
