package LinkedListPractice.java;
class LL2{
    Node head ;
    Node tail;
    void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    void addLast(int data){
        // create the node
        Node newnode = new Node(data);
        if(head == null || tail == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    void printList(){
        // if list is empty
        if(head == null){
            System.out.println("the list is empty ");
        }
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + "->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    void deleteFirst(){
        if(head == null){
            System.out.println("List is empty ");
            return;
        }
        else if(head.next == null){
            head = null;
            return;
        }
        else{
            Node temp = head;
            head = head.next;
        }
    }
    void deleteLast(){
        if(head == null){
            System.out.println("no any node is present ");
            return;
        }
        else if(head.next == null){
            head = null;
            return;
//            System.out.println()
        }
        else{
            Node ptr1 = head ;
            Node ptr2 = head.next;
            while(ptr2.next != null){
                ptr1=ptr1.next;
                ptr2 = ptr2.next;
            }
            ptr1.next = null;
        }
    }
}
class test2{
    public static void main(String[] args) {
        LL2 obj = new LL2();
        obj.printList();
        obj.addFirst(12);
        obj.addFirst(122);
        obj.addFirst(123);
        obj.addFirst(124);
        obj.addLast(123);
        obj.addLast(123);
        obj.addLast(1239);
        obj.printList();
        obj.deleteFirst();
        obj.deleteLast();
        obj.printList();
    }
}