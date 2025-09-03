package DataStructure.Queue.Dequeue;

import java.util.Scanner;

// in deque the inertion and deletetion can be done from both side
class Deque{
    int front ;
    int rear ;
    int size ;
    int []arr;
    // comstructor ogf the ddeque
    Deque(int size){
        front = -1;
        rear = -1;
        arr = new int[size];
    }
    void insertAtFront(int data){
        if(front == (rear + 1)%size){
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
}
class DequeDemo{
    public static void main(String[] args) {
        int size ;
        System.out.println("enter the ssize of the queue ...");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        // creeating object of the queue class
        Deque obj = new Deque(size);
        // inssert at front
        obj.insertAtFront(123);

    }
}