/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {

    private String convertToTime(int[] bin) {
        // 8 4 2 1 | 32 16 8 4 2 1
        int hour = 0, minute = 0;
        for (int i = 0; i < 4; i++) {
            if (bin[i] == 1)
                hour += Math.pow(2, 3 - i);
        }
        if (hour > 11)
            return null;
        for (int i = 0; i < 6; i++) {
            if (bin[i + 4] == 1)
                minute += Math.pow(2, 5 - i);
        }
        if (minute > 59)
            return null;
        return String.format("%d:%02d", hour, minute);

    }

    private void Try(int i, int[] arr, int turnedOn, List<String> res) {
        for (int j = 0; j <= 1; j++) {
            arr[i] = j;
            if (j == 1)
                turnedOn--;
            if (i == 9) {
                if (turnedOn != 0) {
                    continue;
                }
                String str = convertToTime(arr);
                if (str != null)
                    res.add(str);

            } else {
                Try(i + 1, arr, turnedOn, res);
            }
        }
    }

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        int[] arr = new int[10];
        Try(0, arr, turnedOn, res);
        return res;
    }
}
// @lc code=end
