class Solution {
    public boolean isSorted(Node head) {
        // code here
        Node ptr = head ; 
        if(head == null ||head.next == null) return true;
        boolean asending = true;
        boolean desending = true;
        while(ptr != null && ptr.next != null){
            if(ptr.data > ptr.next.data){
                asending = false ;
            }
            if(ptr.data < ptr.next.data){
                desending = false;
            }
            ptr = ptr.next;
        }
        // ptr = head;
        // while(ptr != null && ptr.next != null){
        //     if(ptr.data > ptr.next.data){
        //         desending = true;
        //     }
        //     else{
        //         desending = false;
        //     }
        //     ptr = ptr.next;
        // }
        return asending || desending;
    }
}
