package LinkedListPractice.java.CircularDoubly;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Operation{
    Node head;
    Node tail;
    int size;

    public void creat() {
        int data ;
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            tail.next = head;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }
}
class Main1{
    public static void main(String []args){
        Operation obj = new Operation();
        obj.creat();
    }
}
