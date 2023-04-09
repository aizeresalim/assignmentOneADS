public class task7 {

    public static void solve(int[] arr, int start, int end) {
        if (start >= end) { // Base case: array is already reversed
            return;
        }

        // Swap the elements at start and end positions
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with start incremented and end decremented
        solve(arr, start + 1, end - 1);
    }
}  //kkkk

