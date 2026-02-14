public static void reversePrint(SinglyLinkedListNode llist) {
    // Write your code here
        SinglyLinkedListNode ptr = llist;
        if(ptr == null) return;
        reversePrint(ptr.next);
        System.out.println(ptr.data);
    }
