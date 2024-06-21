/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start

import java.util.Stack;

class MyQueue {

    private Stack<Integer> st;

    public MyQueue() {
        st = new Stack<>();
    }

    public void push(int x) {
        if (st.empty()) {
            st.push(x);
            return;
        }
        int y = st.pop();
        push(x);
        st.push(y);
    }

    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        return st.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
