package com.xcv58.leetcode.first_bad_version;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by xcv58 on 10/17/15.
 */
public class SolutionTest {
    @Test public void test() {
        Random random = new Random();
        Solution solution = new Solution();
        for (int i = 1; i < 1000; i++) {
            test(i, Integer.MAX_VALUE, solution);
            test(1 + random.nextInt(Integer.MAX_VALUE - 1), Integer.MAX_VALUE, solution);
            test(1 + random.nextInt(i * 4 - 1), i * 4, solution);
        }
    }

    private void test(int target, int n, Solution solution) {
        VersionControl.bad = target;
        assertEquals("n: " + n + ", target: " + target, solution.firstBadVersion(n), target);
    }
}
