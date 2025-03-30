import java.util.Scanner;

public class Problem7 {

    // Complexity: factorial - O(N!)
    // Time: O(N!), Space: O(N)
    public static void possibleVariants(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            possibleVariants(remaining, result + ch);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        possibleVariants(s, "");
    }
}
