package com.xcv58.leetcode.find_median_from_data_stream;

import java.util.PriorityQueue;

/**
 * Created by xcv58 on 10/25/15.
 */
class MedianFinder {
    private PriorityQueue<Integer> leftHeap = new PriorityQueue<Integer>(),
            rightHeap = new PriorityQueue<Integer>((o1, o2) -> o2 - o1),
            l = leftHeap, temp;

    /**
     * use temp to swap left/right heap, so that keep balance
     * @param num Adds a number into the data structure.
     */
    public void addNum(int num) {
        (temp = rightHeap).offer(num);
        (rightHeap = leftHeap).offer((leftHeap = temp).poll());
    }


    /**
     * rightHeap may be leftHeap if rightHeap.size() > leftHeap.size()
     * @return the median of current data stream
     */
    public double findMedian() {
        return (rightHeap.peek() + l.peek()) / 2.0;
    }
};

