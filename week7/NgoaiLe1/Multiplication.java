public class Multiplication extends BinaryExpression {

    /**
     * Khoi tao co tham so.
     * @param left - So1.
     * @param right - So2.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Tra ve ket qua phep nhan.
     */
    public double evaluate() throws ArithmeticException {
        return left.evaluate() * right.evaluate();
    }

    /**
     * Tra ve bieu thuc.
     */
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }
}