public class task2 {
    public static void solve() {
        int[] arr = { 3, 2, 4, 1 };
        double average = calculateAverage(arr);
        System.out.println("The average of the numbers is " + average);
    }

    /*
    @calculateAverage - function takes an integer array arr as input and calculates the average of all the integers in the array.
    @arr - array of elements
    @average -  average value of the elements in the array
     */
    private static double calculateAverage(int[] arr) {
        int sum = 0;          // used to keep track of the sum of all the elements in the input array arr
        for (int i = 0; i < arr.length; i++) {     // calculates the sum of all the elements in the array.
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        return average;
    }
}
