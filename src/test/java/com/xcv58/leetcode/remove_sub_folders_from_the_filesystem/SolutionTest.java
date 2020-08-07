package com.xcv58.leetcode.remove_sub_folders_from_the_filesystem;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      Arrays.asList("/a"),
      solution.removeSubfolders(new String[] { "/a" })
    );
    assertEquals(
      Arrays.asList("/a", "/b"),
      solution.removeSubfolders(new String[] { "/a", "/b" })
    );
    assertEquals(
      Arrays.asList("/a"),
      solution.removeSubfolders(new String[] { "/a", "/a/b/c/d" })
    );
    assertEquals(
      Arrays.asList("/a", "/b/c/d", "/z"),
      solution.removeSubfolders(
        new String[] { "/a", "/a/b/c/d", "/b/c/d", "/z" }
      )
    );
    assertEquals(
      Arrays.asList("/a", "/b/c/d", "/z"),
      solution.removeSubfolders(
        new String[] {
          "/a",
          "/a/b/c/d",
          "/b/c/d",
          "/b/c/d/de",
          "/z/a/a/a",
          "/a/b/c/e",
          "/z",
        }
      )
    );
    assertEquals(
      Arrays.asList("/a/b/c/d", "/a/b/c/x", "/a/b/c/y", "/a/b/c/z"),
      solution.removeSubfolders(
        new String[] { "/a/b/c/x", "/a/b/c/y", "/a/b/c/z", "/a/b/c/d" }
      )
    );
  }
}
