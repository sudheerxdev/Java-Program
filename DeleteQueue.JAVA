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
class LinkedQueue1{
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
    int delete(){
        if(size == 0 || front == null){
            System.out.println("under flow ");
            return Integer.MAX_VALUE;
        }
        else{
            int popitem = front.data;
            front = front.next;
            return popitem;
        }
    }
}
class Demo1{
    public static void main(String[] args) {
        LinkedQueue1 obj = new LinkedQueue1();
        obj.display();
        obj.add(12);
        obj.add(123);
        obj.add(1234);
        obj.add(1235);
        obj.add(1236);
        obj.display();
        int res = obj.delete();
        System.out.println("the deleted item is " + res);
    }
}