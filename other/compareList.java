 static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        Stack<Integer>st1 = new Stack<>();
        Stack<Integer>st2 = new Stack<>();
        SinglyLinkedListNode ptr1 = head1 ; 
        SinglyLinkedListNode ptr2 = head2 ; 
        while(ptr1 != null){
            st1.push(ptr1.data);
            ptr1 = ptr1.next;
        }
        while(ptr2 != null){
            st2.push(ptr2.data);
            ptr2 = ptr2.next;
        }
         if(st1.size() != st2.size()){
            return false;
         }
         else{
            while(!st1.empty() && !st2.empty()){
                if(st1.pop() != st2.pop()){
                    return false;
                }
            }
         }
         return true;
    }
