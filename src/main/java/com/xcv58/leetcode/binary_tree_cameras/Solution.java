package com.xcv58.leetcode.binary_tree_cameras;

import com.xcv58.leetcode.TreeNode;

public class Solution {
  class State {
    int subTree, noRootCamera, rootCamera;

    public int covered() {
      return Math.min(this.noRootCamera, this.rootCamera);
    }

    public State(int subTree, int noRootCamera, int rootCamera) {
      this.subTree = subTree;
      this.noRootCamera = noRootCamera;
      this.rootCamera = rootCamera;
    }
  }

  public int minCameraCover(TreeNode root) {
    return getState(root).covered();
  }

  private State getState(TreeNode root) {
    if (root == null) {
      return new State(0, 0, Integer.MAX_VALUE / 100);
    }
    State left = getState(root.left);
    State right = getState(root.right);

    int oneSide = Math.min(left.subTree + right.covered(), right.subTree + left.covered());
    int bothSide = left.subTree + right.subTree;

    return new State(
      left.noRootCamera + right.noRootCamera,
      Math.min(left.rootCamera + right.covered(), right.rootCamera + left.covered()),
      1 + Math.min(oneSide, bothSide)
    );
  }
}
