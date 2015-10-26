package com.xcv58.leetcode.find_median_from_data_stream;

import java.util.PriorityQueue;

/**
 * Created by xcv58 on 10/25/15.
 */
class MedianFinder {
    private PriorityQueue<Integer> leftHeap, rightHeap;

    public MedianFinder() {
        leftHeap = new PriorityQueue<Integer>(32);
        rightHeap = new PriorityQueue<Integer>(32, (o1, o2) -> o2 - o1);
    }

    // Adds a number into the data structure.
    public void addNum(int num) {
        if (leftHeap.size() == rightHeap.size()) {
            if (!leftHeap.isEmpty() && num > leftHeap.peek()) {
                rightHeap.offer(leftHeap.poll());
                leftHeap.offer(num);
            } else {
                rightHeap.offer(num);
            }
        } else {
            if (num < rightHeap.peek()) {
                leftHeap.offer(rightHeap.poll());
                rightHeap.offer(num);
            } else {
                leftHeap.offer(num);
            }
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

