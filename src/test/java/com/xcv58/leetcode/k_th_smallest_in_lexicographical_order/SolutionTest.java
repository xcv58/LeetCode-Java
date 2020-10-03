package com.xcv58.leetcode.k_th_smallest_in_lexicographical_order;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(9999, solution.findKthNumber(10_000, 10_000));
    assertEquals(2, solution.findKthNumber(58, 12));
    assertEquals(3248, solution.findKthNumber(5000, 2500));
    assertEquals(325, solution.findKthNumber(5000, 2502));

    assertEquals(2, solution.findKthNumber(10, 3));
    assertEquals(11, solution.findKthNumber(11, 3));
    assertEquals(12, solution.findKthNumber(12, 4));
    assertEquals(2, solution.findKthNumber(12, 5));
    assertEquals(1, solution.findKthNumber(58, 1));
    assertEquals(10, solution.findKthNumber(58, 2));
    assertEquals(11, solution.findKthNumber(58, 3));
    assertEquals(12, solution.findKthNumber(58, 4));
    assertEquals(13, solution.findKthNumber(58, 5));
    assertEquals(14, solution.findKthNumber(58, 6));
    assertEquals(15, solution.findKthNumber(58, 7));
    assertEquals(16, solution.findKthNumber(58, 8));
    assertEquals(17, solution.findKthNumber(58, 9));
    assertEquals(18, solution.findKthNumber(58, 10));
    assertEquals(19, solution.findKthNumber(58, 11));
    assertEquals(20, solution.findKthNumber(58, 13));
    assertEquals(21, solution.findKthNumber(58, 14));
    assertEquals(36, solution.findKthNumber(58, 30));
    assertEquals(3249, solution.findKthNumber(5000, 2501));
    assertEquals(3250, solution.findKthNumber(5000, 2503));
    assertEquals(3251, solution.findKthNumber(5000, 2504));
    assertEquals(3252, solution.findKthNumber(5000, 2505));
    assertEquals(867519, solution.findKthNumber(1_692_778, 1_545_580));
    assertEquals(2730010, solution.findKthNumber(4289384, 1922239));
    assertEquals(1000006292, solution.findKthNumber(2147483647, 6999));
    assertEquals(416126219, solution.findKthNumber(681692778, 351251360));
    assertEquals(1966367637, solution.findKthNumber(2147483647, 1073741823));
    assertEquals(1966367638, solution.findKthNumber(2147483647, 1073741824));

    assertEquals(10, solution.countStartsWith(1_692_778, 1_692_77));
    assertEquals(1 + 10 + 79, solution.countStartsWith(1_692_778, 1_692_7));
    assertEquals(1, solution.countStartsWith(1_692_778, 1_692_778));
    assertEquals(1 + 10 + 100 + 1000, solution.countStartsWith(10_000, 9));
  }
}
