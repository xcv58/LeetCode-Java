package com.xcv58.leetcode.queue_reconstruction_by_height;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      new int[][] {},
      solution.reconstructQueue(new int[][] {})
    );
    assertArrayEquals(new int[][] {}, solution.reconstructQueue(null));
    assertArrayEquals(
      new int[][] {
        { 5, 0 },
        { 7, 0 },
        { 5, 2 },
        { 6, 1 },
        { 4, 4 },
        { 7, 1 },
      },
      solution.reconstructQueue(
        new int[][] {
          { 7, 0 },
          { 4, 4 },
          { 7, 1 },
          { 5, 0 },
          { 6, 1 },
          { 5, 2 },
        }
      )
    );
    assertArrayEquals(
      new int[][] {
        { 5, 0 },
        { 7, 0 },
        { 5, 2 },
        { 6, 1 },
        { 4, 4 },
        { 7, 1 },
      },
      solution.reconstructQueue(
        new int[][] {
          { 5, 0 },
          { 7, 0 },
          { 5, 2 },
          { 6, 1 },
          { 4, 4 },
          { 7, 1 },
        }
      )
    );
    assertArrayEquals(
      new int[][] {
        { 0, 0 },
        { 6, 0 },
        { 1, 1 },
        { 5, 1 },
        { 5, 2 },
        { 4, 3 },
        { 7, 0 },
        { 6, 2 },
        { 5, 5 },
        { 6, 3 },
      },
      solution.reconstructQueue(
        new int[][] {
          { 0, 0 },
          { 6, 2 },
          { 5, 5 },
          { 4, 3 },
          { 5, 2 },
          { 1, 1 },
          { 6, 0 },
          { 6, 3 },
          { 7, 0 },
          { 5, 1 },
        }
      )
    );
  }
}
