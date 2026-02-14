import java.util.Scanner;

public class SeasonIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int monthNumber = scanner.nextInt();

        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn/Fall";
                break;
            default:
                season = "Invalid month";
        }

        System.out.println("The season is: " + season);
        scanner.close();
    }
}
