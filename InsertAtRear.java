package DataStructure.Queue.Dequeue;

import java.util.Scanner;

// in deque the inertion and deletetion can be done from both side
class Deque1{
    int front ;
    int rear ;
    int size ;
    int []arr;
    // comstructor ogf the ddeque
    Deque1(int size){
        front = -1;
        rear = -1;
        this.size = size;
        arr = new int[size];
    }
    void insertAtFront(int data){
        if((rear + 1)%size == front){
            System.out.println("underflow !! ");
            return;
        }
        else if(front == -1){
            front = rear = 0;
        }
        else if(front == 0){
            front = size -1 ;
        }
        else{
            front = front -1;
        }
        arr[front] = data;
    }
    void insertAtRear(int data){
        if(front == (rear+1)%size){
            System.out.println("queue is full !! ");
            return;
        }
        else if(front == -1){
            front = rear = 0;
        }
        else if(front == rear){
            front = rear = 0;
        }
        else if(rear == size -1){
            rear = 0;
        }
        else {
            rear = rear + 1;
        }
        arr[rear]= data;
    }
}
class DequeDemo1{
    public static void main(String[] args) {
        int size ;
        System.out.println("enter the ssize of the queue ...");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        // creeating object of the queue class
        Deque1 obj = new Deque1(size);
        // inssert at front
        obj.insertAtFront(123);
        obj.insertAtRear(1234);

    }
}