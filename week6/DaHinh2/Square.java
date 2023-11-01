public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setTopLeft(Point topLeft) {
        super.setTopLeft(topLeft);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                super.getTopLeft(), super.getLength(), color, filled);
    }
}