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
class StackLinkedLis2{
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
    int peak(){
        if(top== null){
            System.out.println("the peak element of the stack is not in the stack ");
            return 0;
        }
        else{
            return top.data;
        }
    }
}
class LinkedListDemo2{
    public static void main(String[] args) {
        StackLinkedLis2 obj = new StackLinkedLis2();
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
        System.out.println("the peak elemet is " + obj.peak());
    }
}