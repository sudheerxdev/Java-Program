package LinkedListPractice.java;

//import static LinkedListPractice.java.SLL.Display;

//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//}
class SLL{
    static Node head ;
    Node tail;
    int size ;
     void Insert(int data){
        Node temp = new Node(data);
        if(head == null){
            head = tail = temp;
        }
        else{
            tail.next = temp ;
            tail = temp;
        }
        size++;
    }
     void Display(){
         Node temp = head;
         while(temp != null){
             System.out.print(temp.data + "->");
             temp = temp.next;
         }
         System.out.println("size of linkedlist is " + size);
    }

    public void InsertBegin(int data) {
         Node temp = new Node(data);
         if(head == null){
             head = tail= null;
         }
         temp.next = head;
         head = temp;
         size++;
    }

    public void InsertAT(int data, int pos) {
         Node temp = new Node(data);
         Node x = head;
         if(pos == 0){
             System.out.println("insert at head ");
             temp.next = head ;
             head = temp;
         }
         if(pos == size){
             System.out.println("insert at end ");
             tail.next = temp;
             tail = temp;
         }
         for(int i = 0; i < pos ; i++){
             x = x.next;
         }
         temp.next = x.next;
         x.next = temp;
         size++;
    }
}
class Demo1{
    public static void main(String[] args) {
        SLL ll = new SLL();// instance of linked list class
        // insert a node
        ll.Insert(10);
        ll.Insert(20);
        ll.Insert(30);
        ll.Insert(40);
        ll.Display();
    }
}