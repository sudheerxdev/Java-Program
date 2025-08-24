package LinkedListPractice.java.CircularLL;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class CircularLL{
    Node head ;
    Node tail ;
    int size  = 0;
    void addHead(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            tail.next = head;
        }
        else{
            newnode.next = head;
            tail.next = newnode;
            head = newnode;
        }
    }
//    void print(){
//        System.out.println(tail.data + " ");
//        Node ptr = tail.next;
//        while(ptr != head){
//            System.out.print(ptr.data + "->");
//            ptr = ptr.next;
//        }
//
//    }
void print() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node ptr = head;
    while (true) {
        System.out.print(ptr.data + "->");
        ptr = ptr.next;
        if (ptr == head) break; // stop when we circle back
    }

    System.out.println("(back to head)");
}

}
class Main{
    public static void main(String [] args){
        CircularLL obj = new CircularLL();
        obj.addHead(12);
        obj.addHead(22);
        obj.addHead(32);
        obj.addHead(42);
        obj.addHead(52);
        obj.print();
    }
}