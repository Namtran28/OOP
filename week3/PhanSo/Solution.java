// Import your library
// Do not change the name of the Solution class
public class Solution {

    private int numerator;
    private int denominator = 1;

    /**
     * Ham xet phan so co dung hay khong.
     * @return - Tra ve True neu phan so dung, False neu phan so sai.
     */
    public boolean invalid(int n) {
        return n != 0;
    }

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

    /**
     * Getter of numerator.
     * @return - Tra ve numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Getter of denominator.
     * @return - Tra ve dinominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Setter of Numerator.
     * @param numerator - Numenator.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Settor of Denominator.
     * @param denominator - Denominator.
     */
    public void setDenominator(int denominator) {
        if (invalid(denominator)) {
            this.denominator = denominator;
        }
    }

    /**
     * Khoi tao co tham so.
     * @param numerator - Numenator.
     * @param denominator - Denominator.
     */
    public Solution(int numerator, int denominator) {
        if (invalid(denominator)) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * Khoi tao khong tham so.
     */
    public Solution() {
        this.denominator = 1;
    }

    /**
     * Ham rut gon phan so.
     * @return - Tra ve phan so.
     */
    public Solution reduce() {
        int n = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / n;
        this.denominator = this.denominator / n;
        if (this.denominator < 0 && this.numerator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
        return this;
   }

    /**
     * Ham tinh tong.
     * @param s - Phan so s.
     * @return - Tra ve phan so moi.
     */
    public Solution add(Solution s) {
        Solution infomation = new Solution();
        infomation.numerator = (this.numerator * s.denominator) + (s.numerator * this.denominator);
        infomation.denominator = this.denominator * s.denominator;
        infomation.reduce();
        return infomation;
    }

    /**
     * Ham tinh hieu.
     * @param s - Phan so s.
     * @return - Tra ve phan so moi.
     */
    public Solution subtract(Solution s) {
        Solution infomation = new Solution();
        infomation.numerator = (this.numerator * s.denominator) - (s.numerator * this.denominator);
        infomation.denominator = this.denominator * s.denominator;
        infomation.reduce();
        return infomation;
    }

    /**
     * Ham tinh tich.
     * @param s - Phan so s.
     * @return - Tra ve phan so moi.
     */
    public Solution multiply(Solution s) {
        Solution infomation = new Solution();
        infomation.numerator = this.numerator * s.numerator;
        infomation.denominator = this.denominator * s.denominator;
        infomation.reduce();
        return infomation;
    }

    /**
     * Ham tinh thuong.
     * @param s - Phan so s.
     * @return - Tra ve phanso moi.
     */
    public Solution divide(Solution s) {
        Solution infomation = new Solution();
        if (invalid(s.denominator)) {
            infomation.numerator = this.numerator * s.denominator;
            infomation.denominator = this.denominator * s.numerator;
            infomation.reduce();
        } else {
            infomation.numerator = this.numerator;
            infomation.denominator = this.denominator;
            infomation.reduce();
        }
        return infomation;
    }

    /**
     * Kiem tra hai phan so co bang nhau hay khong.
     * Kiem tra xem obj co kieu du lieu Solution hay khong.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            this.reduce();
            other.reduce();
            if (this.denominator == other.denominator && this.numerator == other.numerator) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    // public static void main(String[] args) {
    //     int a = 4, b = 8;
    //     Solution s = new Solution(a, b);
    //     Solution s1 = new Solution(9, 7);
    //     s.reduce();
    //     System.out.printf("%d %d\n",s.getNumerator(),s.getDenominator());
    //     Solution an =  s.add(s1);
    //     System.out.printf("%d %d\n",an.getNumerator(),an.getDenominator());
    //     Solution ban =  s.subtract(s1);
    //     System.out.printf("%d %d\n",ban.getNumerator(),ban.getDenominator());
    //     Solution can =  s.multiply(s1);
    //     System.out.printf("%d %d\n",can.getNumerator(),can.getDenominator());
    //     Solution dan =  s.divide(s1);
    //     System.out.printf("%d %d\n",dan.getNumerator(),dan.getDenominator());
    // }
} 