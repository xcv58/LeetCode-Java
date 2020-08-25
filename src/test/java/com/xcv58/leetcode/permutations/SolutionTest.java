package com.xcv58.leetcode.permutations;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(List.of(), solution.permute(null));
    assertEquals(List.of(), solution.permute(new int[] {}));
    assertEquals(List.of(List.of(1)), solution.permute(new int[] { 1 }));
    assertEquals(
      List.of(List.of(1, 2), List.of(2, 1)),
      solution.permute(new int[] { 1, 2 })
    );
    assertEquals(
      List.of(
        List.of(1, 2, 3),
        List.of(2, 1, 3),
        List.of(1, 3, 2),
        List.of(3, 1, 2),
        List.of(2, 3, 1),
        List.of(3, 2, 1)
      ),
      solution.permute(new int[] { 1, 2, 3 })
    );
    assertEquals(
      List.of(
        List.of(1, 2, 3, 4),
        List.of(2, 1, 3, 4),
        List.of(1, 3, 2, 4),
        List.of(3, 1, 2, 4),
        List.of(2, 3, 1, 4),
        List.of(3, 2, 1, 4),
        List.of(1, 2, 4, 3),
        List.of(2, 1, 4, 3),
        List.of(1, 4, 2, 3),
        List.of(4, 1, 2, 3),
        List.of(2, 4, 1, 3),
        List.of(4, 2, 1, 3),
        List.of(1, 3, 4, 2),
        List.of(3, 1, 4, 2),
        List.of(1, 4, 3, 2),
        List.of(4, 1, 3, 2),
        List.of(3, 4, 1, 2),
        List.of(4, 3, 1, 2),
        List.of(2, 3, 4, 1),
        List.of(3, 2, 4, 1),
        List.of(2, 4, 3, 1),
        List.of(4, 2, 3, 1),
        List.of(3, 4, 2, 1),
        List.of(4, 3, 2, 1)
      ),
      solution.permute(new int[] { 1, 2, 3, 4 })
    );
  }
}
