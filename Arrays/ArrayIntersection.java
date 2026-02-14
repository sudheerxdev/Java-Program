import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Demo {
    static ArrayList<Integer> intersect(ArrayList<Integer> a, 
                                        ArrayList<Integer> b) {
      
        // Put all elements of a[] in as
        Set<Integer> as = new HashSet<>(a);  
      
        Set<Integer> rs = new HashSet<>();                    
        ArrayList<Integer> res = new ArrayList<>();                            

        // Traverse through b[]
        for (int i = 0; i < b.size(); i++) {
          
            // If the element is in as and not yet in rs
            // a) Add it to the result set
            // b) Add it to the result array
            if (as.contains(b.get(i)) && 
                !rs.contains(b.get(i))) {
                rs.add(b.get(i)); 
                res.add(b.get(i)); 
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(3, 2, 2, 3, 3, 2));

        ArrayList<Integer> res = intersect(a, b);
      
        for (int i = 0; i < res.size(); i++) 
            System.out.print(res.get(i) + " ");
    }
}
