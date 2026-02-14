💻 Create a Time Class

import java.util.Scanner;

public class TimeClass {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeClass(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        TimeClass myTime = new TimeClass(hours, minutes, seconds);
        myTime.displayTime();

        scanner.close();
    }
}


📤 Output:

Input: 10
Input: 30
Input: 45
Output: Time: 10:30:45
