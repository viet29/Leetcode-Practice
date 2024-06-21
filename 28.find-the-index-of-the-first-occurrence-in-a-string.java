/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length(), m = haystack.length();
        for (int i = 0; i < m - n + 1; i++) {
            if (needle.equals(haystack.substring(i, i + n)))
                return i;
        }
        return -1;
    }
}
// @lc code=end
