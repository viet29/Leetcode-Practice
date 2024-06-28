/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    private int a = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        head.next = removeNthFromEnd(head.next, n);
        a++;
        if (a == n) {
            return head.next;
        }
        return head;
    }
}
// @lc code=end
