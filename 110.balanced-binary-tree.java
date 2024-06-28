/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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

    public int height(TreeNode node) {
        if (node == null)
            return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) >= 2) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return height(root) != -1;
    }
}
// @lc code=end
