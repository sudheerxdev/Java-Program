package DataStructure.Stack;

import java.util.Scanner;

//class Node{
//    int data ;
//    Node next;
//    Node(int data){
//        this.data = data ;
//        this.next = null;
//    }
//}
class StackLinkedList1{
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
    int pop(){
        if(top == null){
            System.out.println("stack is empty ");
            return 0;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
}
class LinkedListDemo1{
    public static void main(String[] args) {
        StackLinkedList1 obj = new StackLinkedList1();
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println(obj.pop());
        System.out.println("enter the num,ber of element in the stack ");
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int num ;
            System.out.println("enter the " + (i +1) + " element in the stacck ");
            num = sc.nextInt();
            obj.push(num);
        }
        System.out.println( " the poped item is " + obj.pop());
    }
}