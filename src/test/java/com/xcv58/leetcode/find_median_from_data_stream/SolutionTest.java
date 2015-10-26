package com.xcv58.leetcode.find_median_from_data_stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xcv58 on 10/17/15.
 */
public class SolutionTest {
    @Test public void test() {
        double result;
        result = this.test(1);
        assertEquals(1.0, result, 0.0);

        result = this.test(1, 2);
        assertEquals(1.5, result, 0.0);

        result = this.test(1, 2, 3);
        assertEquals(2.0, result, 0.0);

        result = this.test(1, 2, 3, 4, 5, 6);
        assertEquals(3.5, result, 0.0);

        result = this.test(1, 2, 3, 4, 5, 6, 7);
        assertEquals(4.0, result, 0.0);
    }

    private double test(int... ints) {
        MedianFinder medianFinder = new MedianFinder();
        for (int i : ints) {
            medianFinder.addNum(i);
        }
        return medianFinder.findMedian();
    }
}
