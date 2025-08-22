package LinkedListPractice.java.Doubly;


class DLL4{
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
        head = head.next;
        head.prev = null;
    }
}
class  Demo4{
    public static void main(String args[]){
        DLL4 obj = new DLL4();

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
        obj.DeleteFirst();
        obj.Display();
        obj.ReverseDisplay();
    }
}