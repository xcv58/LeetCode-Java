package com.xcv58.leetcode.rearrange_words_in_a_sentence;

import java.util.*;

public class Solution {

  class Word {
    String word;
    int index;

    public Word(String w, int i) {
      word = w;
      index = i;
    }
  }

  public String arrangeWords(String text) {
    String[] tokens = text.toLowerCase().split(" ");
    PriorityQueue<Word> heap = new PriorityQueue<>(
      (w1, w2) -> {
        if (w1.word.length() != w2.word.length()) {
          return Integer.compare(w1.word.length(), w2.word.length());
        }
        return Integer.compare(w1.index, w2.index);
      }
    );
    for (int i = 0; i < tokens.length; i++) {
      heap.offer(new Word(tokens[i], i));
    }
    String res = "";
    while (heap.size() > 0) {
      Word word = heap.poll();
      if (res.isEmpty()) {
        String tmp =
          word.word.substring(0, 1).toUpperCase() + word.word.substring(1);
        res = tmp;
      } else {
        res += " " + word.word;
      }
    }
    return res;
  }
}
