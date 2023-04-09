public class task9 {
    public static int solve(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return solve(n-1, k-1) + solve(n-1, k);
    }
}

