public class task10 {
    public static int solve(int a, int b) {
        if (b == 0) {  // if b is 0, return a
            return a;
        } else {  // otherwise, recursively call the "solve" method with b and the remainder of a/b
            return solve(b, a % b);
        }
    }
}   //ojjp