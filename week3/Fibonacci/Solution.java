public class Solution {

    /**
     * Ham tim so Fibonacci thu n.
     * 
     * @param n - So n.
     * @return - Tra ve so Fibonacci thu n.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n > 92) {
            return Long.MAX_VALUE;
        }
        
        long[] arr = new long[101];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[(int) n];
    }
}