import java.util.*;

import java.util.Scanner;

public class task4 {
    public static void solve(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factorial = findFactorial(n);
        System.out.println(n + "! = " + factorial);
    }



    /*
     @findFactorial -  that takes an integer n as input and returns the factorial of n.
     @n -  number whose factorial needs to be calculated.

   */
    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}

