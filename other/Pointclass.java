💻 Create a Point Class

import java.util.Scanner;

public class PointClass {

    private int xCoordinate;
    private int yCoordinate;

    public PointClass(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setXCoordinate(int x) {
        this.xCoordinate = x;
    }

    public void setYCoordinate(int y) {
        this.yCoordinate = y;
    }

    public void displayPoint() {
        System.out.println("X Coordinate: " + xCoordinate);
        System.out.println("Y Coordinate: " + yCoordinate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y coordinate: ");
        int y = scanner.nextInt();

        PointClass myPoint = new PointClass(x, y);

        System.out.println("nPoint Details:");
        myPoint.displayPoint();

        scanner.close();
    }
}


📤 Output:

Input: 5
Input: 10
Output:
Enter X coordinate: Enter Y coordinate:
Point Details:
X Coordinate: 5
Y Coordinate: 10
