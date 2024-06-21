/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n - 1 == nums[n - 1])
            return n;
        int low = 0, high = n - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == mid) {
                low = mid + 1;
            } else if (nums[mid] > mid) {
                high = mid - 1;
            }
        }
        return low;
    }
}
// @lc code=end
