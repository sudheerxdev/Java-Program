package LinkedListPractice.java;

class Demo3{
    public static void main(String[] args) {
        SLL lst = new SLL();
        lst.Insert(12);
        lst.Insert(22);
        lst.Insert(32);
        lst.Insert(42);
        lst.Display();
        System.out.println();
        lst.InsertBegin(100);
        lst.InsertBegin(234);
        lst.InsertBegin(42);
        lst.Display();
    }
}