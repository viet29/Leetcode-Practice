/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int start = 0, end = 0, maxlen = 0;
        int[] map = new int[128];
        char[] c = s.toCharArray();
        while (end < s.length()) {
            map[c[end]]++;
            while (map[c[end]] > 1) {
                map[c[start++]]--;
            }
            maxlen = Math.max(maxlen, end - start + 1);
            end++;
        }
        return maxlen;
    }
}
// @lc code=end
