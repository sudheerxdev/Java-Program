package LinkedListPractice.java;

import java.util.Scanner;

import static LinkedListPractice.java.SLL.head;

//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
class FindMiddle{
    Node head ;
    Node tail;
    void findMiddle(){
        Node hare = head;
        Node tortoise = head;
        if(head.next == null || head == null){
            System.out.println("no middle node");
            return;
        }
        while(hare != null && hare.next !=  null){
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        System.out.println(tortoise.data );
    }
    void creat(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void print() {
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    void ReverseList(){
        Node curr = head , next , prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void insertAt(int pos, int data) {
        Node newnode = new Node(data);

        // Case 1: insert at head
        if (pos == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }

        Node ptr = head;
        int count = 0;

        // Traverse to the node just before position
        while (ptr != null && count < pos - 1) {
            ptr = ptr.next;
            count++;
        }

        // If position is out of range
        if (ptr == null) {
            System.out.println("Invalid position");
            return;
        }

        // Insert newnode after ptr
        newnode.next = ptr.next;
        ptr.next = newnode;
    }


//    public void print() {
//            ``
//    }
}
class MainDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        FindMiddle obj = new FindMiddle();
        for(int i= 0 ; i < n ; i++){
            int num ;
            num = sc.nextInt();
            obj.creat(num);
        }
        System.out.println("Linked list is crated ");
        obj.findMiddle();
    }
}