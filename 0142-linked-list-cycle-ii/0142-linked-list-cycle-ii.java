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
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                length=lengthCycle(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        ListNode a =  head;
        ListNode b = head;
        while(length>0){
            a=a.next;
            length--;
        }
        while(a!=b){
            a=a.next;
            b=b.next;
        }
        return a;
        
    }
    public int lengthCycle(ListNode node){
       
                ListNode temp=node;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=node);
                return length;
            }
        
       
}