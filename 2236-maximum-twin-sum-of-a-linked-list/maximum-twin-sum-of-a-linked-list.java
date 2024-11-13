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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode mid=slow;
        
        
        //Inversion Algorithm
        ListNode curr=mid;
        ListNode prev=null;
        ListNode temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            
        }
        ListNode firstHalf=head;
        ListNode secondHalf=prev;
        int maxsum=0;
        while(secondHalf!=null){
            int twinSum=firstHalf.val+secondHalf.val;
            maxsum=(twinSum>maxsum)? twinSum:maxsum;
             // Move both pointers to the next node
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return maxsum;


    }
}