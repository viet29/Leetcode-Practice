/*
 * @lc app=leetcode id=1382 lang=java
 *
 * [1382] Balance a Binary Search Tree
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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

    private void convertToArray(TreeNode root, List<Integer> conf) {
        if (root == null) {

            return;
        }
        convertToArray(root.left, conf);
        conf.add(root.val);
        convertToArray(root.right, conf);
    }

    private TreeNode buildTreeNode(List<Integer> nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums.get(start));
        }
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        // if ((start - end) % 2 != 0)
        // mid++;
        TreeNode node = new TreeNode(nums.get(mid));
        node.left = buildTreeNode(nums, start, mid - 1);
        node.right = buildTreeNode(nums, mid + 1, end);
        return node;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        convertToArray(root, nums);

        return buildTreeNode(nums, 0, nums.size() - 1);
    }
}
// @lc code=end
