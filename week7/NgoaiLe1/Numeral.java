public class Numeral extends Expression {
    private double value;

    /**
     * Khoi tao khong tham so.
     */
    public Numeral() {

    }

    /**
     * Khoi tao co tham so.
     * @param value - So.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Tra ve so.
     */
    public double evaluate() throws ArithmeticException {
        return value;
    }

    /**
     * Tra ve bieu thuc so.
     */
    public String toString() {
        return Integer.toString((int) value);
    }
}