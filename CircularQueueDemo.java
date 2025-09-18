package DataStructure.Queue;

import java.util.Scanner;

class CircularQueueDemo{
    int front ;
    int rear ;
    int size;
    int []arr;
    CircularQueueDemo(int n){
        
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
            front = 0;
        }
        else if(rear == size-1 && front != 0){
            rear = -1;
        }
        arr[++rear] = data;
        System.out.println("data is inserted ");
    }
}
class CircularDemo{
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the queue ");
        n = sc.nextInt();
        CircularQueueDemo obj = new CircularQueueDemo(n);
        for(int  i = 0 ; i < n ; i++){
            int num ;
            num = sc.nextInt();
            obj.push(num);
        }
        obj.push(123);
    }

}
