package com.xcv58.leetcode.minimum_number_of_vertices_to_reach_all_nodes;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.findSmallestSetOfVertices(-1, null));
    assertEquals(null, solution.findSmallestSetOfVertices(10, null));
    assertEquals(
      Arrays.asList(),
      solution.findSmallestSetOfVertices(1, Arrays.asList(Arrays.asList(0, 0)))
    );
    assertEquals(
      Arrays.asList(),
      solution.findSmallestSetOfVertices(
        2,
        Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 0))
      )
    );
    assertEquals(
      Arrays.asList(),
      solution.findSmallestSetOfVertices(
        3,
        Arrays.asList(
          Arrays.asList(0, 1),
          Arrays.asList(0, 2),
          Arrays.asList(2, 1),
          Arrays.asList(1, 0)
        )
      )
    );
    assertEquals(
      Arrays.asList(0),
      solution.findSmallestSetOfVertices(
        3,
        Arrays.asList(Arrays.asList(0, 1), Arrays.asList(0, 2))
      )
    );
    assertEquals(
      Arrays.asList(0, 3),
      solution.findSmallestSetOfVertices(
        6,
        Arrays.asList(
          Arrays.asList(0, 1),
          Arrays.asList(0, 2),
          Arrays.asList(2, 5),
          Arrays.asList(3, 4),
          Arrays.asList(4, 2)
        )
      )
    );
    assertEquals(
      Arrays.asList(0, 1, 2, 3, 4),
      solution.findSmallestSetOfVertices(5, Arrays.asList())
    );
    assertEquals(
      Arrays.asList(0, 3, 4),
      solution.findSmallestSetOfVertices(
        5,
        Arrays.asList(
          Arrays.asList(0, 1),
          Arrays.asList(0, 2),
          Arrays.asList(4, 2)
        )
      )
    );
  }
}
