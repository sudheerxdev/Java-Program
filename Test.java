package corejava.sixoct;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //Sorted by value
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 2);
        map.put("b", 3);
        map.put("c", 1);

        System.out.println("Befor sorted map ");
        System.out.println(map);

        LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream().sorted((e1,e2)->{
            return e1.getValue() - e2.getValue();
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue ,(e1,e2)-> e1,LinkedHashMap::new));


        System.out.println("After sorted map");
        System.out.println(sortedMap);

    }
}