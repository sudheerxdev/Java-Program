package DataStructure.Queue;

import java.util.Scanner;

class ArrayQueue{
    int front , rear , size ;
    int []arr;
    // creating constructor
    ArrayQueue(int n){
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
}
class Main{
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the queue ");
        n = sc.nextInt();
        // creating object of the class
        ArrayQueue obj = new ArrayQueue(n);
        obj.pop();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(55);
        System.out.println(obj.pop());
    }
}