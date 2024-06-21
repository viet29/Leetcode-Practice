/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[idx - 1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}
// @lc code=end
