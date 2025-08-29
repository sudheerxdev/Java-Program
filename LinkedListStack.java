package DataStructure.Stack;

import java.util.Scanner;

class Node{
    int data ;
    Node next;
    Node(int data){
        this.data = data ;
        this.next = null;
    }
}
class StackLinkedList{
    Node top ;
    void push(int data){
        Node newnode = new Node(data);
        if(top == null){
            top = newnode;
        }
        else{
            newnode.next = top;
            top = newnode;
            System.out.println("data is added at the node");
        }
    }
}
class LinkedListDemo{
    public static void main(String[] args) {
        StackLinkedList obj = new StackLinkedList();
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int num ;
            num = sc.nextInt();
            obj.push(num);
        }
    }
}