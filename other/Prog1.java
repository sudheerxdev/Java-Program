package InterviewPractice31jan;

import java.lang.reflect.Array;
import java.util.*;
class Main
{
    public static  int[] TwoSum(int []arr , int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = arr.length ;
        int compliment ;
        for(int i = 0 ; i < n ; i++){
            compliment = target - arr[i];
            if(map.containsKey(compliment)){
                return new int[]{compliment, arr[i]};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5};
        int target = 6;
        int res[] = TwoSum(arr , target);
        System.out.println(Arrays.toString(res));
    }
}