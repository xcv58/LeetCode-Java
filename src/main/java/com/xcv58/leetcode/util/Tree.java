package com.xcv58.leetcode.util;

import com.xcv58.leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tree {

  public static TreeNode getTree(String tree) {
    String[] nodes = tree.replaceAll("\\[|\\]", "").split(",");
    return getTree(nodes);
  }

  private static TreeNode getTree(String[] nodes) {
    if (nodes == null) {
      return null;
    }
    if (nodes.length <= 0) {
      return null;
    }
    List<TreeNode> layer = new ArrayList<>();
    int i = 0;
    TreeNode root = createTreeNode(nodes, i++);
    layer.add(root);
    while (layer.size() > 0) {
      List<TreeNode> nextLayer = new ArrayList<>();
      for (TreeNode node : layer) {
        if (node == null) {
          continue;
        }
        node.left = createTreeNode(nodes, i++);
        node.right = createTreeNode(nodes, i++);
        nextLayer.add(node.left);
        nextLayer.add(node.right);
      }
      layer = nextLayer;
    }
    return root;
  }

  private static TreeNode createTreeNode(String[] nodes, int i) {
    if (i < 0 || i >= nodes.length) {
      return null;
    }
    String val = nodes[i];
    if (val.equalsIgnoreCase("null") || val.isEmpty()) {
      return null;
    }
    return new TreeNode(Integer.parseInt(val));
  }

  public static String inOrder(TreeNode root) {
    if (root == null) {
      return "";
    }
    return Stream
      .of(inOrder(root.left), Integer.toString(root.val), inOrder(root.right))
      .filter(s -> s != null && !s.isEmpty())
      .collect(Collectors.joining(","));
  }
}
