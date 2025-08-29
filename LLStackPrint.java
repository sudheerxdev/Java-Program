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
class StackLinkedList3{
    Node top ;
    void push(int data){
        Node newnode = new Node(data);
        if(top == null){
            top = newnode;
            System.out.println("data is added ast the top ");
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
    void Print(){
        if(top == null){
            System.out.println("there is no lelement in the stavck");
            return;
        }
        else{
            Node ptr = top;
            while(ptr != null){
                System.out.print(ptr.data + "->");
                ptr = ptr.next;
            }
        }
    }
}
class LinkedListDemo3{
    public static void main(String[] args) {
        StackLinkedList3 obj = new StackLinkedList3();
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
//        System.out.println( " the poped item is " + obj.pop());
//        System.out.println("the peak elemet is " + obj.peak());
        obj.Print();
    }
}