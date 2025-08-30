 static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode ptr = head;
        while(ptr != null){
            System.out.println(ptr.data );
            ptr = ptr.next;
        }
        

    }
