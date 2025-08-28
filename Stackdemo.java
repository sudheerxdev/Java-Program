package DataStructure.Stack;

import java.util.Scanner;

class StackDemo{
    int top ;
    int []arr;
    int size ;
    StackDemo(int n){
        top = -1;
        size = n;
        arr = new int[n];
    }
    void push(int data){
        if(top == size -1){
            System.out.println("stack overflow");
            return;
        }
        arr[++top] = data;
        System.out.println("element added at the top position of the " + (top + 1));
    }
}
class MainDemo{
    public static void main(String args[]){
       // creating the object
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the stack");
        n = sc.nextInt();
        StackDemo obj = new StackDemo(n);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

    }
}