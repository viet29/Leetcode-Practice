/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start

import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] arr = new Integer[rowIndex + 1];
        arr[0] = 1;
        arr[rowIndex] = 1;
        for (int i = 1; i < rowIndex; i++) {
            arr[i] = (int) ((long) arr[i - 1] * (rowIndex - i + 1) / i);
        }
        return Arrays.asList(arr);
    }
}
// @lc code=end
