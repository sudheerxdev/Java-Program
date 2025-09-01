package DataStructure.Queue;

import java.util.Scanner;

class ArrayQueue1{
    int front , rear , size ;
    int []arr;
    // creating constructor
    ArrayQueue1 (int n){
        arr = new int[n];
        front = -1;
        rear = -1;
        size = n;
    }
    void push(int data){
        if(rear == size-1){
            System.out.println("overflow !!");
            return;
        }
        else if(front  == -1){
            front = 0;
            rear = 0;
        }
        else{
            rear ++;
        }
        arr[rear] = data;
        System.out.println(data + " data is inserted ");
    }
    int pop(){
        int data;
        if(front == -1){
            System.out.println("underflow !!");
            return 0;
        }
        else if(front == rear){
            data = arr[front];
            front = -1;
            rear = -1;
        }
        else{
            data = arr[front++];
        }
        return data;
    }
    int peek(){
        if(front == -1){
            System.out.println("under flow !!");
            return Integer.MAX_VALUE;
        }
        return arr[front];
    }
}
class Main1{
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the queue ");
        n = sc.nextInt();
        // creating object of the class
        ArrayQueue1 obj = new ArrayQueue1(n);
        obj.pop();
        obj.push(1);
        obj.pop();
        obj.push(2);
        obj.peek();
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(55);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
    }
}