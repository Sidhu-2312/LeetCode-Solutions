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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode maxSoFar=head;
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.next.val < maxSoFar.val){
                current.next=current.next.next;
            }else{
                maxSoFar=current.next;
                current=current.next;
            }
           // head=reverse(current);
        }

        head=reverse(head);
            return head;
        }
        public ListNode reverse(ListNode head){
            if(head==null){
                return head;

            }
            ListNode prev=null;
            ListNode current=head;
            ListNode next=current.next;
            while(current!=null){
                current.next=prev;
                prev=current;
                current=next;
                if(next!=null){
                    next=next.next;
                }
            }
            return prev;
        }
        
    }
