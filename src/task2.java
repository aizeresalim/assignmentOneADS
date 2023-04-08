public class task2 {
    public static void solve() {
        int[] arr = { 3, 2, 4, 1 };
        double average = calculateAverage(arr);
        System.out.println("The average of the numbers is " + average);
    }

    private static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        return average;
    }
}
