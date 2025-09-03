package DataStructure.Queue;

class LLQueue6{
    Node front ;
    Node rear;
    int size ;
    boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }
    void add(int data){
        Node newnode = new Node(data);
        if(front == null){
            front = rear = newnode;
        }
        else{
            rear.next = newnode;
            rear = newnode;
            rear.next = front;
        }
        size++;
    }
    void Display(){
        Node temp = front;
        if(front == null){
            System.out.println("queue is empty !!");
            return;
        }
        else{
            while(temp.next != front){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    // the delete operation in the circular queue
    int delete(){
        int res;
        if(front == null){
            System.out.println("queue is empty !! ");
            return Integer.MAX_VALUE;
        }
        else if(front == rear){
            int data = front.data ;
            front = null;
            rear = null;
            return data;
        }
        else{
            res = front.data;
            front = front.next;
        }
        return res;
    }
    // peek element of the queue
    int peek(){
        if(front == null){
            System.out.println("under floow ");
            return Integer.MAX_VALUE;
        }
        return front.data;
    }
}
class Main6{
    public static void main(String[] args) {
        LLQueue6 obj = new LLQueue6();
        obj.Display();
        obj.add(111);
        obj.add(222);
        obj.add(333);
        obj.add(444);
        obj.add(555);
        obj.Display();
        System.out.println(obj.delete());
        obj.peek();
    }
}