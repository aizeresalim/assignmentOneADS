public class task10 {
    public static int solve(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return solve(b, a % b);
        }
    }
}