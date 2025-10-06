package corejava.sixoct;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDubliCateNUsingJava7and8 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,30,40,50,50);
//  java 7 approach
        Set<Integer> unique = new HashSet<>();
        Set<Integer> dublicate = new HashSet<>();

        for(int num :list) {
            if(!unique.add(num)) {   //if allready present that is dublicate
//    dublicate.add(num);
                System.out.println(num);
            }
        }
//  System.out.println(dublicate);
//  System.out.println(unique);
        int arr[] = {10,20,30,30,40,50,50};
        String dublicate1 = "";
        for(int i = 0;i < arr.length;i++) {
            for(int j = i+1;j <arr.length;j++) {
                if(arr[i]==arr[j]) {
                    dublicate1 = dublicate1 + arr[j]+" ";
                }
            }
        }
        System.out.println(dublicate1);

//  java 8 approach

        Set<Integer> set = new HashSet<>();
        List<Integer> dubliCateNumber = list.stream().filter(n-> !set.add(n)).collect(Collectors.toList());
//  System.out.println(dubliCateNumber);

        List<Integer> dublicateNumber = list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(a->a.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
//  System.out.println(dublicateNumber);








    }
}