public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
         SinglyLinkedListNode prev = null;
            SinglyLinkedListNode curr = llist;
            while (curr != null) {
                SinglyLinkedListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev; 
    }
