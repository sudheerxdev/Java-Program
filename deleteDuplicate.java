public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    // Write your code here
        SinglyLinkedListNode ptr = llist;
        // check if llist is null 
        if(llist == null) return null;
        while(ptr.next != null && ptr != null){
            // check if the node value are the same 
            if(ptr.data == ptr.next.data){
                ptr.next = ptr.next.next;
            }
            else{
                ptr = ptr.next;
            }
        }
        return llist;
    }
