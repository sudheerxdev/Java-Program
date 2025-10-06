package corejava.sixoct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStatWith1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,43,13,23,13,56);
        numbers.stream().map(a->a+" ").filter(a->a.startsWith("1")).forEach(System.out::println);
    }
}