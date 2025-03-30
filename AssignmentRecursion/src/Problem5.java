import java.util.Scanner;

public class Problem5 {

    // Complexity: exponential - O(2^N)
    // Time: O(2^N), Space: O(N)
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fibonacci(n));
    }
}
