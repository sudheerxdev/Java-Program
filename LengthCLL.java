package LinkedListPractice.java.CircularLL;
class CircularLL4{
    Node head ;
    Node tail ;
    int size = 0;
    void addhead(int data){
        // creating the node
        Node newnode = new Node(data);
        if(head == null ){
            head = tail = newnode;
            tail.next = head;
        }
        else{
            newnode.next = head;
            head = newnode ;
            tail.next = head;
        }
        size ++;
    }
    void print(){
        Node ptr = head;
        while(true){
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
            if(ptr == head){
                System.out.println("back to head");
                break;
            }
        }

    }

    public void addtail(int data) {
        Node newnode = new Node(data);
        if(head == null){
            // no node is present
            head = tail = newnode;
            tail.next = head;
        }
        else{
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
        size++;
    }
    void deleteHead(){
        if(head == null){
            System.out.println("unserflow ");
            return ;
        }
        else if(head.next == head){
            head = null;
        }
        else{
            head = head.next;
            tail.next = head;
        }
        size--;
    }
    void deletetail(){
        if(head == null){
            System.out.println("underflow");
            return;
        }
        else if(head.next == head){
            head = null;
            return;
        }
        Node ptr1 = head ;
        Node ptr2 = head.next;
        while(ptr2.next != head){
            ptr1 = ptr1.next ;
            ptr2 = ptr2.next;
        }
        tail = ptr1 ;
        ptr1.next = ptr2.next;
        size --;
    }
    void  printSize(){
        System.out.println("the size of the linked list is " + size);
    }
}
class CLLDemo4{
    public static void main(String args[]){
        CircularLL4 obj = new CircularLL4();
        obj.addhead(1);
        obj.addhead(2);
        obj.addhead(3);
        obj.addhead(4);
        obj.addhead(5);
        obj.addtail(6);
        obj.print();
        obj.printSize();
        obj.deleteHead();
        obj.print();
        obj.deletetail();
        obj.printSize();
    }
}