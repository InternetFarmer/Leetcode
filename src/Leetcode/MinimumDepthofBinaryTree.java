/*
 Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path from the root node 
 down to the nearest leaf node.
 */
package Leetcode;

/**
 *
 * @author Wu
 */
public class MinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            if (root.left == null) {
                return 1 + minDepth(root.right);
            }
            if (root.right == null) {
                return 1 + minDepth(root.left);
            }
            return 1 + Math.min(minDepth(root.right), minDepth(root.left));
        }

    }

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
