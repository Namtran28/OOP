public class Division extends BinaryExpression {

    /**
     * Khoi tao co tham so.
     * @param left - So1.
     * @param right - So2.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Tra ve bieu thuc.
     */
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * Tra ve ket qua phep chia.
     * Nem ra ngoai le chia cho 0.
     */
    public double evaluate() throws ArithmeticException {
        double test;
        if (right.evaluate() == 0) {
            throw new java.lang.ArithmeticException("Lỗi chia cho 0");
        } else {
            test = (int) left.evaluate() / right.evaluate();
        }
        return test;
    }
}