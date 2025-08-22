package LinkedListPractice.java.Doubly;


class DLL2{
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
}
class  Demo2{
    public static void main(String args[]){
        DLL2 obj = new DLL2();

//        obj.InsertAtBegin(12);
//        obj.InsertAtBegin(12);
//        obj.InsertAtBegin(12);
//        obj.InsertAtBegin(12);
//        obj.InsertAtBegin(12);
        obj.InsertAtBegin(12);
        obj.Display();
        obj.InsertAtEnd(123);
        obj.InsertAtEnd(123);
        obj.InsertAtEnd(123);
        obj.InsertAtEnd(123);
        obj.InsertAtEnd(1234);
        obj.Display();
    }
}