package com.xcv58.leetcode.util;

import static org.junit.Assert.assertEquals;

import com.xcv58.leetcode.TreeNode;

import org.junit.Test;

public class TreeTest {
    @Test
    public void testInOrder() {
        TreeNode root = Tree.getTree("");
        assertEquals(Tree.inOrder(root), "");

        root = Tree.getTree("[1]");
        assertEquals(Tree.inOrder(root), "1");

        root = Tree.getTree("[1,2,3]");
        assertEquals(Tree.inOrder(root), "2,1,3");

        root = Tree.getTree("[1,null,3]");
        assertEquals(Tree.inOrder(root), "1,3");

        root = Tree.getTree("[1,2,3,4]");
        assertEquals(Tree.inOrder(root), "4,2,1,3");

        root = Tree.getTree("[1,2,3,4,null,5,6,null,null,null,7,null,8]");
        assertEquals(Tree.inOrder(root), "4,2,1,5,7,3,6,8");
    }

    @Test
    public void testGetTree() {
        TreeNode root = Tree.getTree("");
        assertEquals(null, root);

        root = Tree.getTree("[1]");
        assertTree(root, 1, null, null);

        root = Tree.getTree("[1,2,3]");
        assertTree(root, 1, 2, 3);
        assertTree(root.left, 2, null, null);
        assertTree(root.right, 3, null, null);

        root = Tree.getTree("[1,null,3]");
        assertTree(root, 1, null, 3);

        root = Tree.getTree("[1,2,3,4]");
        assertTree(root, 1, 2, 3);
        assertTree(root.left, 2, 4, null);

        root = Tree.getTree("[1,2,3,4,null,5,6,null,null,null,7,null,8]");
        assertTree(root, 1, 2, 3);
        assertTree(root.left, 2, 4, null);
        assertTree(root.right, 3, 5, 6);
        assertTree(root.right.left, 5, null, 7);
        assertTree(root.right.right, 6, null, 8);
    }

    private void assertTree(TreeNode root, Integer val) {
        if (val == null) {
            assertEquals(null, root);
            return;
        }
        assertEquals((int) val, root.val);
    }

    private void assertTree(TreeNode root, Integer val, Integer left, Integer right) {
        assertTree(root, val);
        if (root != null) {
            assertTree(root.left, left);
            assertTree(root.right, right);
        }
    }
}
