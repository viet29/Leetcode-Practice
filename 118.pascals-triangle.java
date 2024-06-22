/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        res.add(prev);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < prev.size() - 1; j++) {
                row.add(prev.get(j) + prev.get(j + 1));
            }
            row.add(1);
            res.add(row);
            prev = row;
        }
        return res;
    }
}
// @lc code=end
