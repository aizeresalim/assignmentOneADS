import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter task number - ");
        int taskNumber = sc.nextInt();

        switch (taskNumber) {
            case 1:
                task1.solve();
                break;
            case 2:
                task2.solve();
                break;
            case 3:
                task3.solve(args);
                break;
            case 4:
                task4.solve(args);
                break;
            case 5:
                task5.solve();
                break;
            case 6:
                System.out.print("Enter a: ");
                int a = sc.nextInt();
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                int result = task6.solve(a, n);
                System.out.println(a + " raised to the power of " + n + " is " + result);
                break;
            case 7:
                System.out.print("Enter the size of the array: ");
                int arraySize = sc.nextInt();
                int[] arr = new int[arraySize];
                System.out.print("Enter the elements of the array: ");
                for (int i = 0; i < arraySize; i++) {
                    arr[i] = sc.nextInt();
                }

                System.out.println("Original array:");
                for (int i = 0; i < arraySize; i++) {
                    System.out.print(arr[i] + " ");
                }

                task7.solve(arr, 0, arraySize - 1);
                System.out.println("\nReversed array:");
                for (int i = 0; i < arraySize; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            default:
                System.out.println("Invalid task number");
                break;
        }
    }
}
