public class Problem2 {

    // Complexity: linear - 0(N)
    public static double averageOfThem(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return ((n - 1) * averageOfThem(arr, n - 1) + arr[n - 1]) / n;
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 1};
        int n = array.length;
        System.out.println(averageOfThem(array, n));

    }
}
