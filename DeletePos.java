public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
       if(position == 0) return llist.next;
       SinglyLinkedListNode ptr = llist; 
       for(int i = 1; i < position  ; i++){
          ptr = ptr.next;
       }
       ptr.next = ptr.next.next;
       return llist;
    }
