/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> hm = new HashMap<>();

        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');

        int size = s.length();

        st.add(s.charAt(0));

        for (int i = 1; i < size; i++) {
            char c = s.charAt(i);

            if (c == ')' || c == ']' || c == '}') {
                if (st.empty())
                    return false;

                if (st.peek() == hm.get(c))
                    st.pop();
                else
                    return false;
            } else {
                st.add(c);
            }
        }

        return st.empty();
    }
}
// @lc code=end
