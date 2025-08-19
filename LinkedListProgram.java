import java.util.Scanner;

//class Node{
//    int data ;
//    Node next ;
//    Node(int data){
//        this.data = data;
//    }
//}
class ListProgramDemo{
    Node head ;
    Node tail ;
    void print(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
    }
    void creat(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode ;
            tail = newnode;
        }
        else{
            tail.next = newnode ;
            tail = newnode;
        }
    }
    void InsertBeforeHead(int data){
        Node node = new Node(data);
        if(head == null){
            head=tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        System.out.println(data + " data is added befor the head ");
    }
    void InsertAtLast(int data){
        Node temp = new Node(data);
        if(head == null){
            head =tail= temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
}
class ListProgramDemo2{
    public static void main(String[] args) {
        ListProgramDemo obj = new ListProgramDemo();
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number of elements in the list");
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int num ;
            num = sc.nextInt();
            obj.creat(num);
        }
        obj.print();
        System.out.println("Node is created ");
        int val ;
        System.out.println("enter the value you want to add");
        val = sc.nextInt();
        obj.InsertBeforeHead(val);
        obj.print();
        obj.InsertAtLast(val);
        obj.print();
        int lastval = sc.nextInt();
        obj.InsertAtLast(lastval);
        obj.print();
        System.out.println("value inserted at last");
        obj.print();
    }
}