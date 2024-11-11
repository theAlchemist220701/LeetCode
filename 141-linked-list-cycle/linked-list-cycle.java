/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
     
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Check if fast and slow pointers meet
            if (fast == slow) {
                return true;
            }
        }

        return false; // No cycle found
    }
}