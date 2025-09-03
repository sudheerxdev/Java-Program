package DataStructure.Queue;
// normal queue implementation using linkedlist
//class Node{
//    int data ;
//    Node next;
//    Node(int data ){
//        this.data = data ;
//        this.next = null;
//    }
//
//}
class LinkedQueue3{
    Node front ;
    Node rear ;
    int size ;
    public void add(int data){
        Node newnode = new Node(data);
        if(front == null){
            front = rear = newnode;
        }
        else{
            rear.next = newnode;
            rear= newnode;
        }
        size++;
    }

    // method of display function
    void display(){
        if(size == 0){
            System.out.println("under flow ");
            return;
        }
        else{
            Node ptr = front;
            while(ptr != null){
                System.out.print(ptr.data + " ");
                ptr = ptr.next;
            }
        }
    }
    // peek element of the queue
    int peek(){
        if(front == null){
            System.out.println("under flow !!");
            return -1;
        }
        return front.data;
    }
}
class Demo3{
    public static void main(String[] args) {
        LinkedQueue3 obj = new LinkedQueue3();
        obj.display();
        obj.add(12);
        obj.add(123);
        obj.add(1234);
        obj.add(1235);
        obj.add(1236);
        obj.display();
        System.out.println(obj.peek());
    }
}