static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        if(head == null){
            head =  newnode;
        }
        else{
             SinglyLinkedListNode ptr = head ;
             while(ptr.next != null){
                ptr = ptr.next;
             }
             ptr.next = newnode;
        }
        return head;
    }
