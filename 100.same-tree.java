/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean leftCheck = false, rightCheck = false;
        if (p == null && q == null) {
            return true;
        }
        if ((p == null) ^ (q == null)) {
            return false;
        }
        if ((p.val == q.val) && isSameTree(p.left, q.left)) {
            leftCheck = true;
        }
        if (isSameTree(p.right, q.right)) {
            rightCheck = true;
        }
        return leftCheck && rightCheck;
    }
}
// @lc code=end
