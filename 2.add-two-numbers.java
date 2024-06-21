/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a, b;
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            a = (l1 == null) ? 0 : l1.val;
            b = (l2 == null) ? 0 : l2.val;
            tail.next = new ListNode((a + b + carry) % 10);
            carry = (a + b + carry) / 10;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            tail = tail.next;
        }
        ListNode remaining = (l1 == null) ? l2 : l1;
        tail.next = remaining;
        return head.next;
    }
}
// @lc code=end
