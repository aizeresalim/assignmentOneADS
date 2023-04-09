import java.util.Scanner;

public class task5 {

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
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
}