import java.util.Scanner;

public class task1 {
    public static void solve() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];  // Creates a new integer array with size n

        System.out.println("Enter " + n + " integers:"); //// Asks the user to enter n integers and reads the input into the array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = findMin(arr, n); //  // Calls the findMin method with the array and its size as arguments and stores the returned value in min
        System.out.println("The minimum value in the array is: " + min);
    }

    private static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
}
