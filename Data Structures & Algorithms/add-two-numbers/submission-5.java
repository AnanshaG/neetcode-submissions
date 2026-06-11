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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode prev = dummy;

        while(l1!=null && l2!=null){
            int val = l1.val + l2.val + carry;
            carry = val/10;
            int actual = val%10;
            ListNode curr = new ListNode(actual);
            prev.next = curr;
            prev = curr;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 == null){
            while(l2!=null){
            int val = carry + l2.val;
            carry = val/10;
            int actual = val%10;
            ListNode curr = new ListNode(actual);
            prev.next = curr;
            prev = curr;
            l2 = l2.next;
            }
        }
        else{
            while(l1!=null){
            int val = carry + l1.val;
            carry = val/10;
            int actual = val%10;
            ListNode curr = new ListNode(actual);
            prev.next = curr;
            prev = curr;
            l1 = l1.next;
            }
        }

        if(carry!=0){
            ListNode curr = new ListNode(carry);
            prev.next = curr;
            prev = curr;
        }
            

        return dummy.next;
    }
}
