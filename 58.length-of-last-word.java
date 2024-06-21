/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        boolean spaceAtEnd = true;
        int l = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                spaceAtEnd = false;
                l++;
            } else {
                if (!spaceAtEnd)
                    break;
            }
        }
        return l;
    }
}
// @lc code=end
