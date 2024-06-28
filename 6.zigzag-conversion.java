/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int n = s.length(), a = numRows * 2 - 2;
        String res = "";
        for (int i = 0; i < numRows; i++) {
            int idx = i, step = numRows - i - 1;
            boolean isMiddle = false;
            if (step > 0 && step < numRows - 1) {
                isMiddle = true;
            }
            while (idx < n) {
                res += s.charAt(idx);
                if (isMiddle && idx + step * 2 < n) {
                    res += s.charAt(idx + step * 2);
                }
                idx += a;
            }
        }
        return res;

    }
}
// @lc code=end
