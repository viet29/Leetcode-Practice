/*
 * @lc app=leetcode id=1509 lang=java
 *
 * [1509] Minimum Difference Between Largest and Smallest Value in Three Moves
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        int res = nums[nums.length - 1] - nums[0];
        for (int i = 0; i <= 3; i++) {
            res = Math.min(res, nums[nums.length - i - 1] - nums[3 - i]);
        }
        return res;
    }
}
// @lc code=end
