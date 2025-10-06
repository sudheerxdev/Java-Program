package corejava.sixoct;

public class FactorialInmethods {

    public static int factorial(int a) {
        if(a==1)
            return 1;

        else

            System.out.println(a);
        return a*factorial(a-1);


    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}