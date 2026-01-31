package InterviewPractice31jan;
import java.util.*;
// character frequency
class Main3{
    public static void CountFreq(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        System.out.println(map.toString());
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        CountFreq(str);

    }
}