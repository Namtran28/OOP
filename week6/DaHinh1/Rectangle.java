public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Khoi tao khong tham so.
     */
    public Rectangle() {

    }

    /**
     * Khoi tao co tham so.
     * 
     * @param width  - width.
     * @param length - length.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Khoi tao co tham so.
     * 
     * @param width  - width.
     * @param length - length.
     * @param color  - color.
     * @param filled - filled.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Getter of width.
     * 
     * @return - width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Setter of width.
     * 
     * @param width - width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Getter of length.
     * 
     * @return - length.
     */
    public double getLength() {
        return length;
    }

    /**
     * Setter of length.
     * 
     * @param length - length.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    /**
     * toString.
     */
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }
}