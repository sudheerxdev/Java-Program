package LinkedListPractice.java;

class Demo4{
    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.Insert(10);
        ll.Insert(20);
        ll.Insert(30);
        ll.Insert(40);
        ll.Display();
        ll.InsertAT(12,2);
       // ll.InsertAT(0,123);
        ll.Display();
    }
}