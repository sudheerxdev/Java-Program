Day 3 of the DSA streak! ✅
Made it to Day 3 of the 7-day challenge by @PW Skills. Today’s problem by @Raghav Garg was all about Binary Search Trees, and it was a really interesting one to think about
.
The Problem: Given exactly 4 nodes with distinct values (1, 2, 3, and 4), find out how many structurally unique BSTs can be formed
.
I actually tried solving this in two different ways:
1. The DP Approach (Normal Time Complexity) My first thought was to use Dynamic Programming. If you pick any number i as the root, the left subtree has i-1 nodes and the right has n-i nodes. You can store these overlapping subproblems in an array.
Time Complexity: O(N²)
Space Complexity: O(N)
2. The Math Approach (Best Time Complexity) After thinking about it a bit more, I realized this is a classic Catalan Number problem! If you use the formula (2n)! / ((n+1)! * n!), you can find the answer without needing any extra space. For n=4, the answer comes out to exactly 14.
Time Complexity: O(N)
Space Complexity: O(1)
Here is the Java code I wrote for both approaches:
import java.util.Scanner;

public class UniqueBSTs {

    // DP Approach
    public static int numTreesDP(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    // Catalan Number Approach (Optimized)
    public static long numTreesCatalan(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * (2L * n - i) / (i + 1);
        }
        return result / (n + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();
        
        System.out.println("Unique BSTs (DP): " + numTreesDP(n));
        System.out.println("Unique BSTs (Math): " + numTreesCatalan(n));
        scanner.close();
    }
}
Excited to see what tomorrow's question is!
#dsastreakwithpwskills #pwskills #dsa
