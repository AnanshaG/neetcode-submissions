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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        ListNode temp;
        ListNode c1 = list1;
        ListNode c2 = list2;

        if(list1.val > list2.val){
            temp = list2;
            c2 = c2.next;
        }
        else{
            temp = list1;
            c1 = c1.next;
        }

        ListNode head = temp;

        while(c1 != null && c2 != null){
            if(c1.val > c2.val){
                temp.next = c2;
                temp = c2;
                c2 = c2.next;
            }
            else{
                temp.next = c1;
                temp = c1;
                c1 = c1.next;
            }
        }

        if(c1 == null){
            temp.next = c2;
        }
        else{
            temp.next = c1;
        }

        return head;
    }
}