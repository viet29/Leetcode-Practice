/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
/* *
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode n = head, m;
        while (n != null) {
            m = n.next;
            while (m != null && n.val == m.val) {
                m = m.next;
            }
            n.next = m;
            n = n.next;
        }
        return head;
    }
}
// @lc code=end
