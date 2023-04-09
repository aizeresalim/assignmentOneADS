import java.util.*;

public class Main { //ds

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter task number - ");
        int taskNumber = sc.nextInt();   //It creates a Scanner object called "sc" to read user input from the console and prompts the user to enter a task number.

        switch (taskNumber) {   //This code block uses a switch statement to execute the appropriate method based on the value of "taskNumber". For example, if "taskNumber" is equal to 6, the program will prompt the user to enter values for "a
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
            case 8:
                System.out.print("Enter a string: ");
                String s = sc.next();
                System.out.println(s + " contains only digits: " + task8.solve(s));
                break;
            case 9:
                System.out.print("Enter n: ");
                int nValue = sc.nextInt();
                System.out.print("Enter k: ");
                int kValue = sc.nextInt();

                int cResult = task9.solve(nValue, kValue);
                System.out.println("C(" + nValue + "," + kValue + ") = " + cResult);
                break;
            case 10:
                System.out.print("Enter a: ");
                int num1 = sc.nextInt();
                System.out.print("Enter b: ");
                int num2 = sc.nextInt();
                int gcdResult = task10.solve(num1, num2);
                System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcdResult);
                break;

            default:
                System.out.println("Invalid task number");
                break;
        }
    }
}
