/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, minLen = Integer.MAX_VALUE;
        while (end < nums.length) {
            target -= nums[end++];
            while (target <= 0) {
                minLen = Math.min(minLen, end - start);
                target += nums[start++];
            }
        }
        System.gc();
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
// @lc code=end
