package corejava.threeoct;

import java.util.Scanner;

class FindLcm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int i = Math.max(num1, num2);

        while(true) {
            if(i % num1 == 0 && i % num2 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
