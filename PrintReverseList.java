package LinkedListPractice.java.Doubly;


class DLL3{
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
}
class  Demo3{
    public static void main(String args[]){
        DLL3 obj = new DLL3();

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
        obj.ReverseDisplay();
    }
}