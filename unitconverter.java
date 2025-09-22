import java.util.Scanner;

public class UnitConverterUsingSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select conversion type:");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Kilograms to Pounds");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter inches: ");
                double inches = scanner.nextDouble();
                double centimeters = inches * 2.54;
                System.out.println(inches + " inches is equal to " + centimeters + " centimeters");
                break;
            case 2:
                System.out.print("Enter kilograms: ");
                double kilograms = scanner.nextDouble();
                double pounds = kilograms * 2.20462;
                System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds");
                break;
            case 3:
                System.out.print("Enter Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }

        scanner.close();
    }
}
