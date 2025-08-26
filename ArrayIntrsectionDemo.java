import java.util.HashSet;
import java.util.ArrayList;

class MainMethod {

    // Function to find intersection of two arrays
    static ArrayList<Integer> intersect(int[] a, int[] b) {
      
        // Put all elements of a[] in sa
        HashSet<Integer> sa = new HashSet<>();
        for (int num : a) {
            sa.add(num);
        }

        ArrayList<Integer> res = new ArrayList<>();

        // Traverse through b[]
        for (int num : b) {
          
            // If the element is in sa
            if (sa.contains(num)) {
                res.add(num);          // Add it to the result array
                sa.remove(num);        // Erase it from sa to avoid duplicates
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> res = intersect(a, b);

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
