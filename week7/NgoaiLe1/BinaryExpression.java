public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * Khoi tao co tham so.
     * @param left - So1.
     * @param right - So2.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // public String toString(){
    // return "BinaryExpression[left=" + left + ",right=" + right + "]";
    // }

    // public abstract double evaluate();
}