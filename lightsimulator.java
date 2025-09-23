import java.util.Scanner;

public class TrafficLightSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current traffic light colour (red, yellow, green):");
        String lightColour = scanner.nextLine().toLowerCase();

        switch (lightColour) {
            case "red":
                System.out.println("STOP!");
                break;
            case "yellow":
                System.out.println("Get Ready!");
                break;
            case "green":
                System.out.println("GO!");
                break;
            default:
                System.out.println("Invalid colour input.");
        }

        scanner.close();
    }
}
