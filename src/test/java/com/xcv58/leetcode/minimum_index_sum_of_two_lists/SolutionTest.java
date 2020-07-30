package com.xcv58.leetcode.minimum_index_sum_of_two_lists;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.findRestaurant(null, null));
    assertEquals(
      null,
      solution.findRestaurant(new String[] {}, new String[] {})
    );
    assertEquals(
      null,
      solution.findRestaurant(new String[] { "abcd" }, new String[] {})
    );
    assertArrayEquals(
      new String[] { "Shogun" },
      solution.findRestaurant(
        new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" },
        new String[] {
          "Piatti",
          "The Grill at Torrey Pines",
          "Hungry Hunter Steakhouse",
          "Shogun",
        }
      )
    );
    assertArrayEquals(
      new String[] { "Shogun" },
      solution.findRestaurant(
        new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" },
        new String[] { "KFC", "Shogun", "Burger King" }
      )
    );
    assertArrayEquals(
      new String[] { "Shogun", "KFC" },
      solution.findRestaurant(
        new String[] { "Shogun", "KFC", "Tapioca Express", "Burger King" },
        new String[] { "KFC", "Shogun", "Burger King" }
      )
    );
    assertArrayEquals(
      new String[] { "Shogun", "KFC" },
      solution.findRestaurant(
        new String[] {
          "In & Out",
          "Shogun",
          "KFC",
          "Tapioca Express",
          "Burger King",
        },
        new String[] { "Jenny's Kitchen", "KFC", "Shogun", "Burger King" }
      )
    );
  }
}
