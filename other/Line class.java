💻 Create a Line Class

import java.util.Scanner;

public class LineClass {
    private double x1, y1, x2, y2;

    public LineClass(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 coordinate: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1 coordinate: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2 coordinate: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2 coordinate: ");
        double y2 = scanner.nextDouble();

        LineClass line = new LineClass(x1, y1, x2, y2);

        System.out.println("Length of the line: " + line.getLength());

        scanner.close();
    }
}


📤 Output:

Input: 0
Input: 0
Input: 3
Input: 4
Output: Length of the line: 5.0
