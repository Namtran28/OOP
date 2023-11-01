public class Addition extends BinaryExpression {
    
    /**
     * Khoi tao co tham so.
     * @param left - So1.
     * @param right - So2.
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Tra ve tong 2 so.
     */
    public double evaluate() throws ArithmeticException {
        return left.evaluate() + right.evaluate();
    }

    /**
     * In ra bieu thuc.
     */
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}