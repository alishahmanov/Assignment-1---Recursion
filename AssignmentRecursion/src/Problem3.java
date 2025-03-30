import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem3 {

    // Complexity: linear - 0(N)
    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor == n) return true;
        if (n % divisor == 0) return false;

        return isPrime(n, divisor + 1);
    }

    public static String checkPrime(int n) {
        return isPrime(n, 2) ? "Prime" : "Composite";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(checkPrime(n));

    }
}
