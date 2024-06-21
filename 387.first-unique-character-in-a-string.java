/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (m.get(arr[i]) == 1)
                return i;
        }
        return -1;
    }
}
// @lc code=end

