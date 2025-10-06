package corejava.sixoct;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindHigestNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,6,5,4,7,6,5,3,8,2);

//  1st
        Integer higestNumber = numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(higestNumber );
//  2nd
        Integer max = numbers.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println(max);

        int arr[] = {1,6,5,4,7,6,5,3,8,2};
//  3rd
        int hn = 0;
        for(int i = 0;i<arr.length;i++) {
            if(hn < arr[i]) {
                hn = arr[i];
            }
        }
        System.out.println("Hihest Number : "+hn);





    }
}