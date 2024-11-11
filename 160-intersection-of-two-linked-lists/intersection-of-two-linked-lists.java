/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode primary = headA;
        ListNode secondary = headB;

        
        while (primary != secondary) {
            
            primary = (primary == null) ? headB : primary.next;
            secondary = (secondary == null) ? headA : secondary.next;
        }

       
        return primary;
    }
}