public class Circle extends Shape {
    protected double radius;

    /**
     * Khoi tao khong tham so.
     */
    public Circle() {

    }

    /**
     * Khoi tao co tham so.
     * 
     * @param radius - radius.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Khoi tao co tham so.
     * 
     * @param radius - radius.
     * @param color  - color.
     * @param filled - filled.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Getter of radius.
     * 
     * @return - radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setter of radius.
     * 
     * @param radius - radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {

        return 2 * Math.PI * this.radius;
    }

    /**
     * toString.
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color
                + ",filled=" + filled + "]";
    }
}