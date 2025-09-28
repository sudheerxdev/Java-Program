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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next== null){
            return head;
        }
        ListNode newnode = head.next;
        head.next = swapPairs(newnode.next);
        newnode.next = head;
        return newnode;
        
    }
}
