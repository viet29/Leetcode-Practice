/*
 * @lc app=leetcode id=2058 lang=java
 *
 * [2058] Find the Minimum and Maximum Number of Nodes Between Critical Points
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        head = head.next;
        int pos = 1, prevNode = -1, min = Integer.MAX_VALUE, max = 0;
        while (head.next != null) {
            if ((head.val > prev.val && head.val > head.next.val)
                    || (head.val < prev.val && head.val < head.next.val)) {
                if (prevNode > 0) {
                    min = Math.min(min, pos - prevNode);
                    max = pos - prevNode + max;
                }
                prevNode = pos;
            }
            pos++;
            prev = head;
            head = head.next;
        }
        if (max == 0) {
            return new int[] { -1, -1 };
        }
        return new int[] { min, max };
    }
}
// @lc code=end
