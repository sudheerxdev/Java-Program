package DataStructure.Stack;

import java.util.Scanner;

class StackDemo3{
    static int top ;
    int []arr;
    int size ;
    StackDemo3(int n){
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
    static  boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    int pop(){
        if(top == -1){
            System.out.println("stack is in underflow");
            return 0;
        }
        int popdata = arr[top];
        top--;
        return popdata;
    }
    void Display(){
        System.out.print("[");
        while(!isEmpty()){
            System.out.print(arr[top--] + " ");
        }
        System.out.print("]");
    }
}
class MainDemo3{
    public static void main(String args[]){
        // creating the object
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the stack");
        n = sc.nextInt();
        StackDemo3 obj = new StackDemo3(n);
        System.out.println( obj.isEmpty());
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(StackDemo3.isEmpty());
        System.out.println(obj.pop());
        obj.Display();
    }
}