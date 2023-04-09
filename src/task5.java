import java.util.Scanner;

public class task5 {

    /*
   @Fibonacci -  takes an integer argument "n" and returns an integer value.
   @n -   which represents the index of the Fibonacci number to be computed.

 */
    public static int Fibonacci(int n) {
        if (n == 0) {   // If n is 0, the method returns 0.
            return 0;
        } else if (n == 1) {    // This checks if the input value n is 1.
// If n is 1, the method returns 1.
            return 1;
        } else {
            // If n is not 0 or 1, the method recursively calls itself with n-1 and n-2 as input values and adds the results.
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int result = Fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is " + result);
    }
} //