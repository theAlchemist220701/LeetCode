/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        int k=node.next.val;
        node.val=k;
        ListNode temp=node.next.next;
        node.next=temp;
        node.val=k;
    }
}