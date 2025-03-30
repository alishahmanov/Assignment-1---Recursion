import java.util.Scanner;

public class Problem9 {

    // Complexity: exponential - O(2^N)
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;

        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        System.out.println(binomialCoefficient(n, k));
    }
}
