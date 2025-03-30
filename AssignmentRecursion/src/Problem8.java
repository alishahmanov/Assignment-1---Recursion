import java.util.Scanner;

public class Problem8 {

    // Complexity: linear - 0(N)
    public static String isDigits(String s, int n) {
        if (n == s.length()) return "Yes";
        if (!Character.isDigit(s.charAt(n))) return "No";
        return isDigits(s, n + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(isDigits(s, 0));
    }
}
