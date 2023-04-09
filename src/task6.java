import java.util.Scanner;

public class task6 {

    public static int solve(int a, int n) {
        if (n == 0) {  // If n is equal to 0, return 1
            return 1;
        } else {    // Otherwise, call the 'solve' method recursively with a and n-1 as arguments
            return a * solve(a, n - 1);
        }
    }  //kkk
}







