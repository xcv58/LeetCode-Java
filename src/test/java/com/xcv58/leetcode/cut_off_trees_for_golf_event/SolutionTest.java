package com.xcv58.leetcode.cut_off_trees_for_golf_event;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(-1, solution.cutOffTree(null));
    assertEquals(-1, solution.cutOffTree(List.of()));
    assertEquals(0, solution.cutOffTree(List.of(List.of())));
    assertEquals(0, solution.cutOffTree(List.of(List.of(0))));
    assertEquals(
      -1,
      solution.cutOffTree(List.of(List.of(0, 1), List.of(3, 2)))
    );
    assertEquals(3, solution.cutOffTree(List.of(List.of(1, 1), List.of(3, 2))));
    assertEquals(
      6,
      solution.cutOffTree(
        List.of(List.of(1, 2, 3), List.of(0, 0, 4), List.of(7, 6, 5))
      )
    );
    assertEquals(
      -1,
      solution.cutOffTree(
        List.of(List.of(1, 2, 3), List.of(0, 0, 0), List.of(7, 6, 5))
      )
    );
    assertEquals(
      12,
      solution.cutOffTree(
        List.of(List.of(11, 2, 3), List.of(0, 0, 4), List.of(7, 6, 5))
      )
    );
    assertEquals(
      18,
      solution.cutOffTree(
        List.of(List.of(11, 7, 3), List.of(0, 0, 4), List.of(2, 6, 5))
      )
    );
  }
}
