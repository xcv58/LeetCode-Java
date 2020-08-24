package com.xcv58.leetcode.permutations_ii;

import static org.junit.Assert.*;

import java.util.*;
import java.util.stream.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.permuteUnique(null));
    isEquals(Arrays.asList(), solution.permuteUnique(new int[] {}));
    isEquals(
      Arrays.asList(Arrays.asList(1)),
      solution.permuteUnique(new int[] { 1 })
    );
    isEquals(
      Arrays.asList(Arrays.asList(2, 1), Arrays.asList(1, 2)),
      solution.permuteUnique(new int[] { 1, 2 })
    );
    isEquals(
      Arrays.asList(Arrays.asList(1, 1, 1, 1, 1)),
      solution.permuteUnique(new int[] { 1, 1, 1, 1, 1 })
    );
    isEquals(
      Arrays.asList(
        Arrays.asList(1, 1, 1, 1, 1, 2),
        Arrays.asList(1, 1, 1, 1, 2, 1),
        Arrays.asList(1, 1, 1, 2, 1, 1),
        Arrays.asList(1, 1, 2, 1, 1, 1),
        Arrays.asList(1, 2, 1, 1, 1, 1),
        Arrays.asList(2, 1, 1, 1, 1, 1)
      ),
      solution.permuteUnique(new int[] { 1, 1, 1, 1, 1, 2 })
    );
    isEquals(
      Arrays.asList(
        Arrays.asList(1, 1, 1, 1, 1, 2, 2),
        Arrays.asList(1, 1, 1, 1, 2, 1, 2),
        Arrays.asList(1, 1, 1, 2, 1, 1, 2),
        Arrays.asList(1, 1, 2, 1, 1, 1, 2),
        Arrays.asList(1, 2, 1, 1, 1, 1, 2),
        Arrays.asList(2, 1, 1, 1, 1, 1, 2),
        Arrays.asList(1, 1, 1, 1, 2, 2, 1),
        Arrays.asList(1, 1, 1, 2, 1, 2, 1),
        Arrays.asList(1, 1, 2, 1, 1, 2, 1),
        Arrays.asList(1, 2, 1, 1, 1, 2, 1),
        Arrays.asList(2, 1, 1, 1, 1, 2, 1),
        Arrays.asList(1, 1, 1, 2, 2, 1, 1),
        Arrays.asList(1, 1, 2, 1, 2, 1, 1),
        Arrays.asList(1, 2, 1, 1, 2, 1, 1),
        Arrays.asList(2, 1, 1, 1, 2, 1, 1),
        Arrays.asList(1, 1, 2, 2, 1, 1, 1),
        Arrays.asList(1, 2, 1, 2, 1, 1, 1),
        Arrays.asList(2, 1, 1, 2, 1, 1, 1),
        Arrays.asList(1, 2, 2, 1, 1, 1, 1),
        Arrays.asList(2, 1, 2, 1, 1, 1, 1),
        Arrays.asList(2, 2, 1, 1, 1, 1, 1)
      ),
      solution.permuteUnique(new int[] { 1, 1, 1, 1, 1, 2, 2 })
    );
  }

  private void isEquals(List<List<Integer>> l1, List<List<Integer>> l2) {
    Set s1 = l1.stream().map(x -> x.toString()).collect(Collectors.toSet());
    Set s2 = l2.stream().map(x -> x.toString()).collect(Collectors.toSet());
    assertEquals(s1, s2);
  }
}
