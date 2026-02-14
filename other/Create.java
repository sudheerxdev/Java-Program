import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//class Node{
//    int data ;
//    Node next ;
//    Node(int data){
//        this.data = data;
//    }
//}
class SortLinkedListDemo1{
    Node head = null;
    Node tail = null;
    void creat(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode ;
            tail = newnode;
        }
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    ArrayList<Integer>DataCollection(){
       ArrayList<Integer>temp = new ArrayList<>();
       Node ptr = head;
       while(ptr != null){
           temp.add(ptr.data);
           ptr = ptr.next;
       }
        System.out.println("all data are added :");
       return temp;
    }
}

class MainDemo1{
    public static void main(String[] args) {
        SortLinkedListDemo obj = new SortLinkedListDemo();
//        obj.creat(10);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the number of the node ");
        for(int i = 0 ; i < n ; i++){
            int num ;
            num = sc.nextInt();
            obj.creat(num);
        }
        System.out.println("node is created ");
        obj.print();
        ArrayList<Integer> res =  obj.DataCollection();
        System.out.println("the data of the linkedlist in the order as ");
        System.out.println(res);

        Collections.sort(res);
        System.out.println(res);
        for(int i = 0 ; i < n ; i++){

            obj.creat(res.get(i));
        }
        System.out.println();
        obj.print();
    }
}
