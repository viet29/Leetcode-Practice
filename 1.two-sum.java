/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> setInt = new HashSet<>();
        int i;
        int[] arr = new int[2];

        for (i = 0; i < nums.length; i++) {
            if (setInt.contains(target - nums[i])) {
                break;
            }
            setInt.add(nums[i]);
        }

        for (int j = 0; j < i; j++) {
            if (target - nums[i] == nums[j]) {
                arr[0] = i;
                arr[1] = j;
            }
        }

        return arr;
    }
}
// @lc code=end
