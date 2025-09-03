package DataStructure.Queue;

class LLQueue{
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
}
class Main5{
    public static void main(String[] args) {
        LLQueue obj = new LLQueue();
        obj.Display();
        obj.add(111);
        obj.add(222);
        obj.add(333);
        obj.add(444);
        obj.add(555);
        obj.Display();
    }
}