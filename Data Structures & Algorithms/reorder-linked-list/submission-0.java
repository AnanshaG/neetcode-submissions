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
    public void reorderList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head_temp = slow.next;
        slow.next = null;

        ListNode reverse_head = reverseLL(head_temp);

        mergeLL(reverse_head, head);
        
    }

    public ListNode reverseLL(ListNode head){
        ListNode prev = null;
        
        while(head!=null){
           ListNode ahead = head.next;
           head.next = prev;
           prev = head;
           head = ahead;
        }

        return prev;
    }

    public ListNode mergeLL(ListNode rh, ListNode h){

        ListNode curr = h;
        while(curr!=null & rh!=null){
            ListNode ah = curr.next;
            curr.next = rh;
            curr = rh;
            rh = rh.next;
            if(ah == null){
                curr.next = rh;
                return h;
            }
            curr.next = ah;
            curr = ah;

        }
        return h;
    }


}
