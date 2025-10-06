package corejava.sixoct;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerTest {
    public static void main(String[] args) {

//  HashMap<Integer, String> map = new HashMap<>();
//  ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
//
//  map.put(12, "Hello");
//  map.put(14, "how");
//  map.put(16, "are");
//  map.put(45, "you");
//
////  for concurrent modification
//
//  Set set = map.entrySet();
//  Iterator iterator = set.iterator();
//  while (iterator.hasNext()) {
//   Map.Entry entry = (Map.Entry) iterator.next();
//   System.out.println(entry.getValue() + " : " + entry.getKey());
//   map.put(24, "hi");
//   }

        List<Integer> intergers = Arrays.asList(1,2,4,5,6,7,8,9,8,4);

//   Integer sumOfEvenNumber = intergers.stream().filter(a-> a%2==0).reduce(Integer::sum).get();
//   System.out.println(sumOfEvenNumber);
//
//   List<Integer> collect = intergers.stream().collect(Collectors.toList());
//   System.out.println(collect);
//
////   second higeast number
//   Integer secondHigestNumber = intergers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//
//   System.out.println(secondHigestNumber);

        List<Integer> removeDublicate = intergers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(a->a.getValue()>=1).map(a->a.getKey()).collect(Collectors.toList());
        System.out.println(removeDublicate);

        List<Integer> removeDublicate1 = intergers.stream().distinct().toList();
        System.out.println(removeDublicate1);
    }
}