package com.xcv58.leetcode.serialize_and_deserialize_binary_tree;

import static org.junit.Assert.*;

import com.xcv58.leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.Test;

/**
 * Created by xcv58 on 10/17/15.
 */
public class SolutionTest {

  @Test
  public void test() {
    assertTrue("only root", test(getRandomTree(0)));
    assertTrue("two nodes tree", test(getRandomTree(1)));
    assertTrue("arbitrary small tree", test(getRandomTree(16)));
    assertTrue("arbitrary big tree", test(getRandomTree(128)));
    assertTrue("arbitrary huge tree", test(getRandomTree(65536)));
  }

  private boolean test(TreeNode root) {
    return isSameTree(root, getTreeNode(getString(root)));
  }

  private TreeNode getRandomTree(int n) {
    Random random = new Random();
    List<TreeNode> list = new ArrayList<>();
    TreeNode root = new TreeNode(0);
    list.add(root);
    for (int i = 0; i < n; i++) {
      int randomInt = random.nextInt(i + 1);
      TreeNode tmpNode = list.get(randomInt);
      if (random.nextBoolean()) {
        while (tmpNode.left != null) {
          tmpNode = tmpNode.left;
        }
        tmpNode.left = new TreeNode(i);
        list.add(tmpNode.left);
      } else {
        while (tmpNode.right != null) {
          tmpNode = tmpNode.right;
        }
        tmpNode.right = new TreeNode(i);
        list.add(tmpNode.right);
      }
    }
    return root;
  }

  private String getString(TreeNode root) {
    return new Codec().serialize(root);
  }

  private TreeNode getTreeNode(String s) {
    return new Codec().deserialize(s);
  }

  private boolean isSameTree(TreeNode t1, TreeNode t2) {
    if (t1 == null || t2 == null) {
      return t1 == t2;
    }
    return (
      t1.val == t2.val &&
      isSameTree(t1.left, t2.left) &&
      isSameTree(t1.right, t2.right)
    );
  }
}
