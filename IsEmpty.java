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
class LinkedQueue2{
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
    // is empty method
    boolean isEmpty(){
        if(front == null || size == 0){
            return true;
        }
//      return true;
        return false;
    }
}
class Demo2{
    public static void main(String[] args) {
        LinkedQueue2 obj = new LinkedQueue2();
        obj.display();
        boolean bool = obj.isEmpty();
        System.out.println(bool);
        obj.add(12);
        obj.add(123);
        obj.add(1234);
        obj.add(1235);
        obj.add(1236);
        obj.display();
        System.out.println(obj.isEmpty());
    }
}