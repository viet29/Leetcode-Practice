/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1, center = 0;
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length - 1; i++) {
            int j = i;
            while (j >= 0) {

            }
        }

    }
}
// @lc code=end
