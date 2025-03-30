import java.util.Scanner;

public class Problem6 {
    // Complexity: linear - O(N)
    public static int powerOf(int a, int n) {
        if (n == 0) return 1;
        return a * powerOf(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        System.out.println(powerOf(a, n));
    }
}
