package LinkedListPractice.java.Doubly;


class DLL1{
    Node head;
    Node tail;
    void InsertAtBegin(int data){
        Node newnode = new Node(data);
        if(head == null){
//            newnode.next = head;
//            head.prev = newnode;
            head = newnode;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
class  Demo1{
    public static void main(String args[]){
        DLL1 obj = new DLL1();

        obj.InsertAtBegin(12);
        obj.InsertAtBegin(12);
        obj.InsertAtBegin(12);
        obj.InsertAtBegin(12);
        obj.InsertAtBegin(12);
        obj.InsertAtBegin(12);
        obj.Display();
    }
}