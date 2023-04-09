import java.util.Scanner;

public class task6 {

    public static int solve(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * solve(a, n - 1);
        }
    }
}







