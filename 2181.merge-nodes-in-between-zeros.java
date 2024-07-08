/*
 * @lc app=leetcode id=2181 lang=java
 *
 * [2181] Merge Nodes in Between Zeros
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
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        ListNode res = new ListNode(0);
        ListNode a = res;
        int sum = 0;
        while (head != null) {
            if (head.val == 0) {
                a.next = new ListNode(sum);
                a = a.next;
                sum = 0;
            } else {
                sum += head.val;
            }
            head = head.next;
        }
        return res.next;
    }
}
// @lc code=end
