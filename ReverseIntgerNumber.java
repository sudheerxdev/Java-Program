package corejava.sixoct;

public class ReverseIntgerNumber {

    public static void main(String[] args) {

        int numbers = 34576;

        int reverse = 0;

        while (numbers != 0) {
            int remender = numbers % 10;
            reverse = reverse * 10 + remender;
            numbers = numbers / 10;

        }
        System.out.println(reverse);
    }
}