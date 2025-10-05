package corejava.threeoct;

import java.util.Scanner;

class GameCharacterMovement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xCoordinate = 0;
        int yCoordinate = 0;
        String move;

        do {
            System.out.print("Enter movement (N/S/E/W), or Q to quit: ");
            move = scanner.nextLine().toUpperCase();

            switch (move) {
                case "N":
                    yCoordinate++;
                    break;
                case "S":
                    yCoordinate--;
                    break;
                case "E":
                    xCoordinate++;
                    break;
                case "W":
                    xCoordinate--;
                    break;
                case "Q":
                    System.out.println("Exiting the game.");
                    break;
                default:
                    System.out.println("Invalid movement. Please use N, S, E, W or Q.");
            }

            System.out.println("Current position: (" + xCoordinate + ", " + yCoordinate + ")");

        } while (!move.equals("Q"));

        scanner.close();
    }
}
