 public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode ptr =  llist;
        for(int i = 1; i < position -1 ; i++){
            ptr = ptr.next;
        }
        newnode.next = ptr.next ; 
        ptr.next = newnode;
        return llist;
    }
