public class Problem1 {


    // Complexity: linear - 0(N)
    public static int minOfThem(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int minOfRest = minOfThem(arr, n - 1);

        return Math.min(arr[n - 1], minOfRest);
    }

    public static void main(String[] args) {
        int[] array = {10, 1, 0, 3, 45};
        int n = array.length;

        System.out.println(minOfThem(array, n));

    }
}