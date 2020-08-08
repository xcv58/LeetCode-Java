package com.xcv58.leetcode.validate_stack_sequences;

import java.util.*;

public class Solution {

  public boolean validateStackSequences(int[] pushed, int[] popped) {
    if (pushed == null || popped == null) {
      return false;
    }
    if (pushed.length != popped.length) {
      return false;
    }
    Stack<Integer> stack = new Stack<>();
    int i = 0;
    for (int j = 0; j < popped.length; j++) {
      int pop = popped[j];
      if (stack.empty() || stack.peek() != pop) {
        for (; i < pushed.length; i++) {
          int push = pushed[i];
          stack.push(push);
          if (push == pop) {
            i++;
            break;
          }
        }
      }
      if (stack.empty() || stack.peek() != pop) {
        return false;
      }
      stack.pop();
    }
    return stack.empty();
  }
}
