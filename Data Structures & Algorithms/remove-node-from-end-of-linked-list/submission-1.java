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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode c = head;
        while(c!=null){
            count+=1;
            c = c.next;
        }

        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        int place = count - n;
        int counter = 0;
        c = head;
        while(counter < place){
            counter++;
            prev = c;
            c = c.next;
        }

        prev.next = c.next;

        if(c == head){
            return prev.next;
        }

        return head;
        
        
    }
}
