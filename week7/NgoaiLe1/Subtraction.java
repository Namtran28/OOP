public class Subtraction extends BinaryExpression {

    /**
     * Khoi tao co tham so.
     * @param left - So1.
     * @param right - So2.
     */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Tinh ket qua bieu thuc.
     */
    public double evaluate() throws ArithmeticException {
        return left.evaluate() - right.evaluate();
    }

    /**
     * In ra bieu thuc.
     */
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}