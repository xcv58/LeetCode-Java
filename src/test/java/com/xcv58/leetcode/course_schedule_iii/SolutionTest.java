package com.xcv58.leetcode.course_schedule_iii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      4,
      solution.scheduleCourse(
        new int[][] { { 1, 8 }, { 1, 3 }, { 2, 19 }, { 2, 5 } }
      )
    );
    assertEquals(
      2,
      solution.scheduleCourse(new int[][] { { 5, 5 }, { 4, 6 }, { 2, 6 } })
    );
    assertEquals(
      6,
      solution.scheduleCourse(
        new int[][] {
          { 5, 5 },
          { 4, 6 },
          { 1, 6 },
          { 1, 6 },
          { 1, 6 },
          { 1, 6 },
          { 1, 6 },
          { 1, 6 },
          { 2, 6 },
        }
      )
    );
    assertEquals(
      13,
      solution.scheduleCourse(
        new int[][] {
          { 100, 200 },
          { 200, 1300 },
          { 1000, 1250 },
          { 2000, 3200 },
          { 100, 3000 },
          { 200, 3000 },
          { 100, 3000 },
          { 200, 3200 },
          { 300, 3300 },
          { 400, 3400 },
          { 400, 3400 },
          { 400, 3400 },
          { 400, 3400 },
          { 400, 3400 },
          { 400, 3400 },
          { 400, 3400 },
          { 400, 3400 },
          { 400, 3400 },
          { 400, 13400 },
        }
      )
    );
  }
}
