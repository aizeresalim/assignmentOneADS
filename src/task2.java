import java.util.Scanner;

public class task2 {
    public static void solve() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }     // The loop continues until all n integers have been entered and stored in the array.

        double average = calculateAverage(arr);
        System.out.println("The average of the numbers is " + average);

        input.close();
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
        return average;  //The variable "average" is calculated by dividing the sum of all elements by the length of the array, and it is cast to a double to ensure decimal precision
    }
}
