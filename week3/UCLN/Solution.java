// Import your library
// Do not change the name of the Solution class
public class Solution {

    /**
     * Ham tim index cua 2 so a va b.
     * @param a - so a.
     * @param b - so b.
     * @return - Tra ve index.
     */
    public static int gcd(int a, int b) {
        int index = 1;
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                index = i;
            }
        }
        return index;
    }
}  