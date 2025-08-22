package LinkedListPractice.java.Doubly;

import java.util.Scanner;

class DLL{
    Node head;
    Node tail;
    void creat(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode ;
            newnode.prev = tail;
            tail = newnode;
        }
    }
    void   Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
class Main{
    public static void main(String args[]){
        DLL obj = new DLL();
        Scanner sc = new Scanner(System.in);
        int data;
        System.out.println("enter the data -1 to stop creation of linked list ");
        for(int i = 0 ; ; i++){
            data = sc.nextInt();
            if(data == -1)break;
            else{
                obj.creat(data);
            }
        }
        obj.Display();
    }
}
