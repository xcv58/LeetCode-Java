package com.xcv58.leetcode.find_median_from_data_stream;

import java.util.PriorityQueue;

/**
 * Created by xcv58 on 10/25/15.
 */
class MedianFinder {
    private PriorityQueue<Integer> leftHeap, rightHeap;

    public MedianFinder() {
        leftHeap = new PriorityQueue<Integer>();
        rightHeap = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);
    }

    // Adds a number into the data structure.
    public void addNum(int num) {
        rightHeap.offer(num);
        leftHeap.offer(rightHeap.poll());
        if (leftHeap.size() > rightHeap.size()) {
            rightHeap.offer(leftHeap.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (rightHeap.isEmpty()) {
            return -1.0;
        }
        if (rightHeap.size() > leftHeap.size()) {
            return rightHeap.peek();
        } else {
            return (rightHeap.peek() + leftHeap.peek()) / 2.0;
        }
    }
};

