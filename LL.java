package LinkedListPractice.java;

class LL{
    Node head ;
    Node tail;
    void PrintList(){
        if(head == null){
            System.out.println("head is null");
            return ;
        }
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp= temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    void addLast(int data){
        Node newnode = new  Node(data);

        if(tail == null || head == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
}
class test{
    public static void main(String[] args) {
        // creating list
        LL obj =new LL();
        obj.PrintList();
        obj.addFirst(123);
        obj.addFirst(124);
        obj.addFirst(125);
        obj.PrintList();
        obj.addLast(1235);
        obj.PrintList();

    }
}