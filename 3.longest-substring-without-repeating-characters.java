/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, maxLen = 0;
        int[] map = new int[128];
        for (char c : s.toCharArray()) {
            map[c]++;
        }
        while (end < s.length()) {
            if (map[s.charAt(end)] > 0) {
                maxLen = Math.max(maxLen, end - start);
            }
            map[s.charAt(end)]--;
            end++;
            while (map[s.charAt(end - 1)] < 0) {
                map[s.charAt(start++)]++;
            }
        }
        return maxLen;
    }
}
// @lc code=end
