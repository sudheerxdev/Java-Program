package LinkedListPractice.java.Doubly;


import java.util.Scanner;

class DLL5{
    Node head;
    Node tail;
//    void InsertAtBegin(int data){
//        Node newnode = new Node(data);
//        if(head == null){
    ////            newnode.next = head;
    ////            head.prev = newnode;
//            head = newnode;
//        }
//        else{
//            newnode.next = head;
//            head.prev = newnode;
//            head = newnode;
//        }
//    }
    void InsertAtEnd(int data){
        Node newnode = new Node(data);
        if(head == null && tail == null){
            head =  tail = newnode;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }
    void Display(){
        Node temp = head;
        if(head == null){
            System.out.println("no Node in the linkedlist ");
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void InsertAtBegin(int data) {
        Node newnode = new Node(data);
        if(head == null){
            head = tail =newnode;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void ReverseDisplay() {
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    public void DeleteFirst() {
        if(head == null){
            System.out.println("there is no node in linkedlist ");
        }
        head = head.next;
        head.prev = null;
    }

    public void InsertAt(int pos , int data) {
        Node newnode = new Node(data);
        Node temp = head;
        int count = 1;
        if(pos == 0){
            head = tail =  newnode;
            return;
        }
        while(temp != null && count < pos){
            temp = temp.next;
            count ++;
        }
      //  assert temp != null;
        if(temp == null && count < pos){
            System.out.println("position of the node is graeter then the node size ");
            return ;
        }
        newnode.prev = temp;
        newnode.next= temp.next;
        if(temp.next != null){
            temp.next.prev = newnode;

        }
        temp.next = newnode;
    }
}
class  Demo5{
    public static void main(String args[]){
          DLL5  obj = new DLL5();

//        obj.InsertAtBegin(12);
//        obj.InsertAtBegin(12);
//        obj.InsertAtBegin(12);
//        obj.InsertAtBegin(12);
//        obj.InsertAtBegin(12);
        int pos ;
        Scanner sc = new Scanner(System.in);
        pos = sc.nextInt();
        obj.InsertAt(pos , 19019);
        obj.InsertAtBegin(12);
        obj.Display();
        obj.InsertAtEnd(123);
        obj.InsertAtEnd(123);
        obj.InsertAtEnd(123);
        obj.InsertAtEnd(123);
        obj.InsertAtEnd(1234);
        obj.Display();
        obj.ReverseDisplay();
        obj.DeleteFirst();
        obj.Display();
        obj.ReverseDisplay();
//        Scanner sc = new Scanner(System.in);
//        int pos ;
//        pos = sc.nextInt();
//        obj.InsertAt(pos , 19019);
        obj.Display();
    }
}