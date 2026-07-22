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
    public boolean isPalindrome(ListNode head) {
        ListNode mid= middleNode(head);
        ListNode rev = reverse(mid);
        ListNode rerev=rev;
        while(head!=null && rev !=null ){
            if(head.val!=rev.val){
                break;
            }
            head=head.next;
            rev=rev.next;
        }
          reverse(rerev);
        if(head==null || rev==null){
            return true;
        }
        return false;
        
    }
    public ListNode middleNode(ListNode node){
        ListNode fast = node;
        ListNode slow=node;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public ListNode reverse(ListNode node){
        if(node==null){
            return node;

        }
        ListNode prev = null;
        ListNode curr = node;
        ListNode next=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}