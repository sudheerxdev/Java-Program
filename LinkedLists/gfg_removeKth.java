/* Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
        Node ptr = head;
        Node preptr = head;
        int count = 1 ; 
        if(head == null || k==1) return head;
        if(k <= 0) return null;
        Node curr = head; 
        Node prev = null;
        while(curr != null){
            // count ++;
            if(count % k == 0){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
            count ++;
        }
        return head;
    }
}
