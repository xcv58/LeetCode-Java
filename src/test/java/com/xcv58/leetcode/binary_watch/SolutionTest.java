package com.xcv58.leetcode.binary_watch;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      Arrays.asList("0:00").toArray(),
      solution.readBinaryWatch(0).toArray()
    );
    assertArrayEquals(
      Arrays
        .asList(
          "0:01",
          "0:02",
          "0:04",
          "0:08",
          "0:16",
          "0:32",
          "1:00",
          "2:00",
          "4:00",
          "8:00"
        )
        .toArray(),
      solution.readBinaryWatch(1).toArray()
    );
    assertArrayEquals(
      Arrays.asList().toArray(),
      solution.readBinaryWatch(9).toArray()
    );
    assertArrayEquals(
      Arrays
        .asList(
          "7:31",
          "7:47",
          "7:55",
          "7:59",
          "11:31",
          "11:47",
          "11:55",
          "11:59"
        )
        .toArray(),
      solution.readBinaryWatch(8).toArray()
    );
  }
}
