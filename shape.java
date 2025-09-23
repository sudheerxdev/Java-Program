import java.util.Scanner;

public class ShapeMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Shape Menu:");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Area of Square");
            System.out.println("3. Calculate Area of Rectangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("Area of circle: " + circleArea);
                    break;
                case 2:
                    System.out.print("Enter side of the square: ");
                    double side = scanner.nextDouble();
                    double squareArea = side * side;
                    System.out.println("Area of square: " + squareArea);
                    break;
                case 3:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth of the rectangle: ");
                    double breadth = scanner.nextDouble();
                    double rectangleArea = length * breadth;
                    System.out.println("Area of rectangle: " + rectangleArea);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
