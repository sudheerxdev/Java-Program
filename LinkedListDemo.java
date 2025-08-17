package LinkedListPractice.java;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class ListDemo1{
    static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        // linking part
        head.next = b ;
        b.next = c;
        // printing part
        print(head);
    }
}