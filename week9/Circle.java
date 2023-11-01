public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * hi.
     * @param center hi.
     * @param radius hi.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * hi.
     */
    public double getArea() {
        return (Double) (PI * radius * radius);
    }

    /**
     * hi.
     */
    public double getPerimeter() {
        return (Double) (2 * PI * radius);
    }

    /**
     * hi.
     */
    public String getInfo() {
        String s = "";
        s += "Circle[";
        s += String.format("(%.2f,%.2f),", center.getPointX(), center.getPointY());
        s += String.format("r=%.2f]", radius);
        return s;
    }
}