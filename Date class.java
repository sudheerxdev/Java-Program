💻 Create a Date Class

import java.util.Scanner;

public class DateClass {

    private int day;
    private int month;
    private int year;

    public DateClass(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        DateClass myDate = new DateClass(day, month, year);

        System.out.print("The date you entered is: ");
        myDate.displayDate();

        scanner.close();
    }
}


📤 Output:

Input: 15
Input: 8
Input: 2023
Output: Enter day: Enter month: Enter year: The date you entered is: 15/8/2023
