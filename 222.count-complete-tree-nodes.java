/*
 * @lc app=leetcode id=222 lang=java
 *
 * [222] Count Complete Tree Nodes
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    private int count = 0;

    private int height(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return count;
        }
        int left = height(root.left), right = height(root.right);
        if (left == 0) {
            return count + 1;
        }

        if (left > right) {
            count += 1 + Math.pow(2, right) - 1;
            return countNodes(root.left);
        } else {
            count += 1 + Math.pow(2, left) - 1;
            return countNodes(root.right);
        }
    }
}
// @lc code=end
