public abstract class Expression {
    public abstract String toString();

    public abstract double evaluate() throws ArithmeticException;

    // public static void main(String[] args) {
    // Expression e = new Square(
    // new Addition(new Addition(
    // new Square(new Numeral(10)), new Numeral(-3))
    // , new Multiplication(new Numeral(5), new Numeral(-3)))
    // );
    // System.out.println(e);
    // }
} 