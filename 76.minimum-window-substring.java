/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        int[] map = new int[128];
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        char[] arr = s.toCharArray();
        while (end < arr.length) {
            // If the character exists in t, decrease the count,
            // if the character does not exist in t, the value will be negative
            // If the character exists in t, decrease the count
            if (map[arr[end]] > 0) {
                count--;
            }
            map[arr[end]]--;
            end++;
            // If count is 0, it means that the substring contains all the characters in t
            // Then move the start pointer to the right to find the minimum substring
            // If the character does not exist in t, the value will be negative
            // If the character exists in t, increase the count
            while (count == 0) {
                // Update the minimum substring
                if (end - start < minLen) {
                    // Update the minimum substring
                    minStart = start;
                    minLen = end - start;
                }
                if (map[arr[start]] == 0) {
                    count++;
                }
                map[arr[start]]++;
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
// @lc code=end
