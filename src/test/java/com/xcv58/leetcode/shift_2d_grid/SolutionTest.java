package com.xcv58.leetcode.shift_2d_grid;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9)),
      solution.shiftGrid(
        new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
        0
      )
    );
    assertEquals(
      List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9)),
      solution.shiftGrid(
        new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
        9
      )
    );
    assertEquals(
      List.of(List.of(2, 3, 4), List.of(5, 6, 7), List.of(8, 9, 1)),
      solution.shiftGrid(
        new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
        8
      )
    );
    assertEquals(
      List.of(List.of(1), List.of(2), List.of(3), List.of(4)),
      solution.shiftGrid(new int[][] { { 4 }, { 1 }, { 2 }, { 3 } }, 3)
    );
  }
}
