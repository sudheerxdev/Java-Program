package LinkedListPractice.java;



import java.util.Scanner;

class MainDemo1111{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
         FindMiddle obj1 = new FindMiddle();
        for(int i= 0 ; i < n ; i++){
            int num ;
            num = sc.nextInt();
            obj1.creat(num);
        }
        System.out.println("Linked list is crated ");
        obj1.print();
        int pos ;
        pos = sc.nextInt();
        int data = sc.nextInt();
        obj1.insertAt(pos , data);
        obj1.print();
    }
}