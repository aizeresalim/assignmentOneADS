public class task3 {

    public static void solve(String[] args) {
        int n = 7;
        if (isPrime(n))
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        return isPrimeHelper(n, 5);
    }

    public static boolean isPrimeHelper(int n, int i) {
        if (i * i > n)
            return true;
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
        return isPrimeHelper(n, i + 6);
    }
}
