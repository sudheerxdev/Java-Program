import java.util.Scanner;

public class VowelOrConsonantSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().charAt(0);

        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(alphabet + " is a vowel");
                break;
            default:
                if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
                    System.out.println(alphabet + " is a consonant");
                } else {
                    System.out.println(alphabet + " is not an alphabet");
                }
        }

        scanner.close();
    }
}
