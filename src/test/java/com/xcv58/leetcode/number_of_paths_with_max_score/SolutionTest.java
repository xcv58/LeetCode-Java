package com.xcv58.leetcode.number_of_paths_with_max_score;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] { 0, 0 }, solution.pathsWithMaxScore(null));
    assertArrayEquals(
      new int[] { 7, 1 },
      solution.pathsWithMaxScore(List.of("E23", "2X2", "12S"))
    );
    assertArrayEquals(
      new int[] { 4, 2 },
      solution.pathsWithMaxScore(List.of("E12", "1X1", "21S"))
    );
    assertArrayEquals(
      new int[] { 0, 0 },
      solution.pathsWithMaxScore(List.of("EX2", "XX1", "21S"))
    );
    assertArrayEquals(
      new int[] { 1773, 690285631 },
      solution.pathsWithMaxScore(
        List.of(
          "E999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
          "999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999S"
        )
      )
    );
  }
}
