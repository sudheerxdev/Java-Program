package InterviewPractice31jan;

import java.util.Scanner;
import java.util.*;

// reverse a string without using builtin method
class Main1{
    public static String ReverseFunction(String str){
        char [] ch= str.toCharArray();
        int left = 0 , right = str.length() - 1;
        while(left < right){
            char temp = ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right --;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        System.out.println("function call");
        String res;
        res = ReverseFunction(str);
        System.out.println("function call");
        System.out.println(str + " -> " + res);
    }
}