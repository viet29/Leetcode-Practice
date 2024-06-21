/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        for (Integer integer : nums1) {
            set.add(integer);
        }
        Set<Integer> intersectionSet = new HashSet<>();
        for (Integer integer : nums2) {
            if (set.contains(integer)) {
                intersectionSet.add(integer);
            }
        }
        return intersectionSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end
