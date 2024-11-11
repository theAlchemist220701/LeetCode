/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
   
    while (head != null && head.val == val) {
    head = head.next;
}
    ListNode result=head;
    ListNode curr=head;
    ListNode prev=null;
    ListNode temp;



    while(curr!=null){
        if(curr.val==val)
        {
            prev.next=curr.next;
        }
       else {
                // Update prev only if curr is not removed
                prev = curr;
            }
            // Move curr to the next node
            curr = curr.next;
    }


    
    return result;





        
    }
}