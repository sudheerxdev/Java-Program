package corejava;

import java.util.Scanner;

class DayOfWeekBasedOnNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayOfWeek;

        if (dayNumber == 1) {
            dayOfWeek = "Monday";
        } else if (dayNumber == 2) {
            dayOfWeek = "Tuesday";
        } else if (dayNumber == 3) {
            dayOfWeek = "Wednesday";
        } else if (dayNumber == 4) {
            dayOfWeek = "Thursday";
        } else if (dayNumber == 5) {
            dayOfWeek = "Friday";
        } else if (dayNumber == 6) {
            dayOfWeek = "Saturday";
        } else if (dayNumber == 7) {
            dayOfWeek = "Sunday";
        } else {
            dayOfWeek = "Invalid Input! Please enter a number between 1 and 7.";
        }

        System.out.println("Day of the week: " + dayOfWeek);

        scanner.close();
    }
}
