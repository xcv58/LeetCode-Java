package com.xcv58.leetcode.serialize_and_deserialize_binary_tree;

import com.xcv58.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xcv58 on 10/26/15.
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "null,";
        }
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    private int i;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        i = 0;
        return deserialize(data.split(","));
    }

    private TreeNode deserialize(String[] tokens) {
        if (i >= tokens.length) {
            return null;
        }
        String val = tokens[i++];
        if ("null".equals(val) || "".equals(val)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = deserialize(tokens);
        root.right = deserialize(tokens);
        return root;
    }
}
