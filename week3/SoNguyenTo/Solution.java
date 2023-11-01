import java.lang.Math;

public class Solution {
    
    /**
     * Ham tra ve kieu True/ False.
     * @param n - So n.
     * @return - Tra ve kieu Boolearn.
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n > 3) {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                } 
            }
        }
        return true;
    }
}  