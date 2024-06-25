/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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

    private TreeNode divineAndConquer(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = start + (end - start) / 2;
        if ((start + end) % 2 != 0)
            mid++;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = divineAndConquer(nums, start, mid - 1);
        node.right = divineAndConquer(nums, mid + 1, end);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return divineAndConquer(nums, 0, nums.length - 1);
    }
}
// @lc code=end
