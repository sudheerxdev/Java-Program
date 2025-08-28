package DataStructure.Stack;

import java.util.Scanner;

class StackDemo1{
    int top ;
    int []arr;
    int size ;
    StackDemo1(int n){
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
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
}
class MainDemo1{
    public static void main(String args[]){
        // creating the object
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the stack");
        n = sc.nextInt();
        StackDemo1 obj = new StackDemo1(n);
        System.out.println( obj.isEmpty());
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.isEmpty());

    }
}