public class task8 {
    public static boolean solve(String s) {
        // Base case: empty string is considered all digits
        if (s.isEmpty()) {
            return true;
        }
        char c = s.charAt(0);
        if (!Character.isDigit(c)) {
            return false;
        }

        return solve(s.substring(1));
    }
}
