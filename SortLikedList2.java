import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class SortLinkedListDemo {
    Node head = null;
    Node tail = null;

    void creat(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    ArrayList<Integer> DataCollection(){
        ArrayList<Integer> temp = new ArrayList<>();
        Node ptr = head;
        while(ptr != null){
            temp.add(ptr.data);
            ptr = ptr.next;
        }
        return temp;
    }
}

class MainDemo {
    public static void main(String[] args) {
        SortLinkedListDemo obj = new SortLinkedListDemo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter node values:");
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            obj.creat(num);
        }

        System.out.println("Original Linked List:");
        obj.print();

        ArrayList<Integer> res = obj.DataCollection();
        Collections.sort(res);

        // Update linked list with sorted values
        Node temp = obj.head;
        int i = 0;
        while(temp != null){
            temp.data = res.get(i);
            temp = temp.next;
            i++;
        }

        System.out.println("Sorted Linked List:");
        obj.print();
    }
}
