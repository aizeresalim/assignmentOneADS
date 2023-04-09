public class task3 {

    public static void solve(String[] args) {
        int n = 7;
        if (isPrime(n))
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }
    /*
      @isPrime - checks if n is less than or equal to 1,then it checks if n is less than or equal to 3
      @n - numbers to be checked

    */
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        return isPrimeHelper(n, 5);
    }


    /*
      @isPrimeHelper - recursively check if a given number n is prime by checking if it is divisible by any numbers of the form 6k ± 1, where k is an integer.
      @n -  an integer value representing the number to be checked for primality
      @i - an integer value representing the current divisor being checked to determine whether n is prime.

    */
    public static boolean isPrimeHelper(int n, int i) {
        if (i * i > n)
            return true;
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
        return isPrimeHelper(n, i + 6);
    }
}
