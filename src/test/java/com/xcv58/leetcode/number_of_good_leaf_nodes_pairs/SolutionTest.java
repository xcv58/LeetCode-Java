package com.xcv58.leetcode.number_of_good_leaf_nodes_pairs;

import static org.junit.Assert.*;

import com.xcv58.leetcode.util.Tree;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.countPairs(null, 0));
    assertEquals(0, solution.countPairs(null, 10));
    assertEquals(0, solution.countPairs(null, -1));
    assertEquals(0, solution.countPairs(null, -2));
    assertEquals(0, solution.countPairs(Tree.getTree("1"), -2));
    assertEquals(0, solution.countPairs(Tree.getTree("1"), 0));
    assertEquals(0, solution.countPairs(Tree.getTree("1"), 10));
    assertEquals(0, solution.countPairs(Tree.getTree("1"), 1));
    assertEquals(0, solution.countPairs(Tree.getTree("1,2,3"), 1));
    assertEquals(1, solution.countPairs(Tree.getTree("1,2,3"), 2));
    assertEquals(2, solution.countPairs(Tree.getTree("1,2,3,4,5,6,7"), 2));
    assertEquals(2, solution.countPairs(Tree.getTree("1,2,3,4,5,6,7"), 3));
    assertEquals(6, solution.countPairs(Tree.getTree("1,2,3,4,5,6,7"), 4));
    assertEquals(6, solution.countPairs(Tree.getTree("1,2,3,4,5,6,7"), 40));
    assertEquals(
      3,
      solution.countPairs(Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13"), 2)
    );
    assertEquals(
      5,
      solution.countPairs(Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13"), 3)
    );
    assertEquals(
      9,
      solution.countPairs(Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13"), 4)
    );
    assertEquals(
      13,
      solution.countPairs(Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13"), 5)
    );
    assertEquals(
      21,
      solution.countPairs(Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13"), 6)
    );
    assertEquals(
      21,
      solution.countPairs(Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13"), 7)
    );
    assertEquals(
      21,
      solution.countPairs(Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13"), 70)
    );
    assertEquals(
      4,
      solution.countPairs(
        Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15"),
        2
      )
    );
    assertEquals(
      4,
      solution.countPairs(
        Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15"),
        3
      )
    );
    assertEquals(
      12,
      solution.countPairs(
        Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15"),
        4
      )
    );
    assertEquals(
      12,
      solution.countPairs(
        Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15"),
        5
      )
    );
    assertEquals(
      28,
      solution.countPairs(
        Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15"),
        6
      )
    );
    assertEquals(
      28,
      solution.countPairs(
        Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15"),
        7
      )
    );
    assertEquals(
      28,
      solution.countPairs(
        Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15"),
        8
      )
    );
    assertEquals(
      28,
      solution.countPairs(
        Tree.getTree("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15"),
        70
      )
    );
  }
}
