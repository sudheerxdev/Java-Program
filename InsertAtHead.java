 static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        newnode.next = llist;
        llist = newnode;
        return llist;

    }
