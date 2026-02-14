package InterviewPractice31jan;

import java.util.Scanner;
import java.util.*;

// reverse a string without using builtin method
class Main2{
    public static boolean CheckPalindrome(String str){
        char[] ch = str.toCharArray();
        int left = 0 , right = ch.length-1;
        while(left < right ){
            if(ch[left]==ch[right]){
                    left ++;
                    right--;
            }
            else{
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        //System.out.println("function call");
        String res;
        System.out.println(CheckPalindrome(str));
    }
}