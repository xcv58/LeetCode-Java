package com.xcv58.leetcode.jump_game_iv;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minJumps(null));
    assertEquals(0, solution.minJumps(new int[] {}));
    assertEquals(0, solution.minJumps(new int[] { 1 }));
    assertEquals(1, solution.minJumps(new int[] { 1, 2, 3, 4, 5, 6, 7, 1 }));
    assertEquals(
      4,
      solution.minJumps(new int[] { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4 })
    );
    assertEquals(
      3,
      solution.minJumps(
        new int[] { 100, -23, -23, 404, 100, 23, 23, 23, 3, 404 }
      )
    );
    assertEquals(
      4,
      solution.minJumps(
        new int[] { 120, -23, -23, 404, 100, 23, 23, 23, 3, 404 }
      )
    );
    assertEquals(1, solution.minJumps(new int[] { 7, 6, 9, 6, 9, 6, 9, 7 }));
    assertEquals(2, solution.minJumps(new int[] { 6, 1, 9 }));
    assertEquals(
      3,
      solution.minJumps(new int[] { 11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13 })
    );
    assertEquals(20, solution.minJumps(getUniqueIntArray(21)));
    assertEquals(2000, solution.minJumps(getUniqueIntArray(2001)));
    assertEquals(200000, solution.minJumps(getUniqueIntArray(200001)));
  }

  private int[] getUniqueIntArray(int n) {
    int[] res = new int[n];
    HashSet<Integer> used = new HashSet<>();
    for (int i = 0; i < n; i++) {
      int random = (int) (Math.random() * n * 100);
      while (used.contains(random)) {
        random = (int) (Math.random() * n * 100);
      }
      res[i] = random;
      used.add(random);
    }
    return res;
  }
}
