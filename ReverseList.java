package LinkedListPractice.java;

import LinkedListPractice.java.FindMiddle;

import java.util.Scanner;

import static LinkedListPractice.java.SLL.head;

class ReverseListDemo{
//    void ReverseList(){
//        Node curr = head , next , prev = null;
//        while(curr != null){
//            next = curr.next;
//            curr.next = prev ;
//            prev = curr;
//            curr = next;
//        }
//        head = prev;
//    }
}
class MainDemo111{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        FindMiddle obj1 = new FindMiddle();
        for(int i= 0 ; i < n ; i++){
            int num ;
            num = sc.nextInt();
            obj1.creat(num);
        }
        System.out.println("Linked list is crated ");
        obj1.print();
        obj1.ReverseList();
        obj1.print();
    }
}