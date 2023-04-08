public class task1 {


    public static void solve() {
        int[] arr = {10,7,32,3,5};
        int min = findMin(arr, arr.length);
        System.out.println("Min from arr is: "+ min + " " + arr.length);
    }

    /*
    @findMin - finds minimum in the array of numbers
    @arr - array of elements
    @n - the length of array
    @result - minimum value
     */
    private static int findMin(int[] arr, int n){
        if(n==1)                        // checks if there is only one element in array
            return arr[0];
        else{                           // if more than 1
            int min  = findMin(arr,n-1);
            int result = Math.min(min, arr[n-1]);
            return result;
        }
    }
}
