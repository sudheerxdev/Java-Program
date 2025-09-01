package DataStructure.Queue;

import java.util.Scanner;

class CircularQueueDemo2{
    int front ;
    int rear ;
    int size;
    int []arr;
    CircularQueueDemo2(int n){
        ///  initially
        front = -1;
        rear = -1;
        size = n ;
        arr = new int[n];
    }
    void push(int data){
        if((rear+1)%size==front){
            System.out.println("overflow !!");
            return;
        }
        else if(front == -1){
            // insertiomn of the first elemenrt
            front = 0;
        }
        rear = (rear + 1)% size;
        arr[rear] = data;
        System.out.println( data + " data is inserted ");
    }
    int pop(){
        if(front == -1){
            System.out.println("underflow !! ");
            return Integer.MIN_VALUE;
        }
        int data = arr[front];
        // if only omne elemenr is presrent ;
        if(front == rear){
            front = -1 ;
            rear = -1;
        }
        else{
            front = (front + 1)%size;
        }
        return data;
    }
}
class CircularDemo2{
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the queue ");
        n = sc.nextInt();
        CircularQueueDemo2 obj = new CircularQueueDemo2(n);
        for(int  i = 0 ; i < n ; i++){
            int num ;
            num = sc.nextInt();
            obj.push(num);
        }
        obj.push(123);
        System.out.println(obj.pop());
    }
}