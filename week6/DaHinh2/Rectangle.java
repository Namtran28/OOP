public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Khoi tao co tham so.
     * @param width  - Rong.
     * @param length - Dai.
     * @param color  - Mau.
     * @param filled - filled.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Khoi tao co tham so.
     * @param topLeft - Point.
     * @param width   - Rong.
     * @param length  - Dai.
     * @param color   - Mau.
     * @param filled  - filled.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Ham so sanh.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        if (topLeft == null) {
            if (other.topLeft != null) {
                return false;
            }
        } else if (!topLeft.equals(other.topLeft)) {
            return false;
        }
        if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
                topLeft, width, length, color, filled);
    }
}