public class Square extends Expression {

    private Expression expression;

    /**
     * Khoi tao co tham so.
     * @param expression - Bieu thuc.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * Tinh gia tri bieu thuc.
     */
    public double evaluate() {
        double value = expression.evaluate();
        return value * value;
    }

    /**
     * In ra bieu thuc.
     */
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }
}