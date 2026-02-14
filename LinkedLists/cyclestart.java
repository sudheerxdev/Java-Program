class Solution {
    public int cycleStart(Node head) {
        // code here
        int count = 1;
        Node tortoise = head;
        Node hare = head;
        boolean loop = false;
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            if(tortoise == hare){
                loop = true;
                break;
            }
        }
        if(! loop ){
            return 0;
        }
        tortoise = head;
        while(tortoise != hare){
            tortoise = tortoise.next;
            hare =hare.next;
            //tortoise = tortoise.next;
        }
        Node ptr = head;
        while(ptr != tortoise){
            ptr = ptr.next;
            count ++;
        }
        return count ;
    }
}  
// class Solution {
//     public int cycleStart(Node head) {
//         if (head == null || head.next == null) return 0;

//         Node tortoise = head;
//         Node hare = head;

//         // Step 1: Detect cycle using Floyd’s algorithm
//         boolean loop = false;
//         while (hare != null && hare.next != null) {
//             hare = hare.next.next;
//             tortoise = tortoise.next;
//             if (tortoise == hare) {
//                 loop = true;
//                 break;
//             }
//         }

//         // No cycle found
//         if (!loop) {
//             return 0;
//         }

//         // Step 2: Find cycle start
//         tortoise = head;
//         int count = 1; // position starts at 1
//         while (tortoise != hare) {
//             tortoise = tortoise.next;
//             hare = hare.next;
//             count++;
//         }

//         return count + 1; // position of cycle start
//     }
// }
