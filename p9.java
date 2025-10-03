package corejava.threeoct;

import java.util.*;

//  WA java program to print the addition of all the digit from a number

class AdditionofNumberme {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int add = 0;

        while(num != 0) {

            int rem = num % 10;
            add = add + rem;
            num = num / 10;
        }

        System.out.println(add);
    }

}
