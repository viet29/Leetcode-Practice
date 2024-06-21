/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        if (size == 0)
            return "";
        if (size == 1)
            return strs[0];
        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[size - 1].length());
        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[size - 1].charAt(i))
            i++;
        String pre = strs[0].substring(0, i);
        return pre;
    }
}
// @lc code=end
