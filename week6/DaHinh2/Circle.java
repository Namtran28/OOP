public class Circle extends Shape {
    protected Point center;
    protected double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Khoi tao tham so.
     * @param center - point.
     * @param radius - BK.
     * @param color  - Mau.
     * @param filled - filled.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
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
        Circle other = (Circle) obj;
        if (center == null) {
            if (other.center != null) {
                return false;
            }
        } else if (!center.equals(other.center)) {
            return false;
        }
        if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                center, radius, color, filled);
    }
}