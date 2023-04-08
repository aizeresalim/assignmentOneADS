import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter task number - ");
        int taskNumber = sc.nextInt();

        int n = 7;
        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

        switch (taskNumber) {
            case 1:
                task1.solve();
                break;
            case 2:
                task2.solve();
                break;
            case 3:
                task3.solve(n);
                break;
            default:
                System.out.println("Invalid task number");
                break;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
