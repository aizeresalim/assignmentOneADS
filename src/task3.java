public class task3 {
    public static boolean solve(int n) {
        if (n <= 1) {
            return false;
        }
        return isPrimeRecursive(n, 2);
    }
    private static boolean isPrimeRecursive(int n, int divisor) {
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrimeRecursive(n, divisor + 1);
    }
}
