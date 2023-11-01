public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * hi.
     * @param p1 hi.
     * @param p2 hi.
     * @param p3 hi.
     * @throws RuntimeException hi.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        boolean checking = true;
        checking = check(p1, p2);
        checking = check(p1, p3);
        checking = check(p2, p3);
        checking = checks(p1, p2, p3);
        if (checking == false) {
            throw new RuntimeException();
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * hi.
     * @param a hi.
     * @param b hi.
     * @return hi.
     */
    public boolean check(Point a, Point b) {
        if (a.equals(b)) {
            return true;
        }
        return false;
    }

    /**
     * hi.
     * @param a hi.
     * @param b hi.
     * @param c hi.
     * @return hi.
     */
    public boolean checks(Point a, Point b, Point c) {
        Point v1 = new Point(a.getPointX() - b.getPointX(),
                a.getPointY() - b.getPointY());
        Point v2 = new Point(a.getPointX() - c.getPointX(),
                a.getPointY() - c.getPointY());
        if ((v1.getPointX() / v2.getPointX()) == (v1.getPointY() / v2.getPointY())) {
            return false;
        }
        return true;
    }

    /**
     * hi.
     */
    public double getArea() {

        double c1 = p1.distance(p2);
        double c2 = p1.distance(p3);
        double c3 = p2.distance(p3);
        double p = (Double) ((c1 + c2 + c3) / 2);
        return (Double) (Math.sqrt(p * (p - c1) * (p - c2) * (p - c3)));
    }

    /**
     * hi.
     */
    public double getPerimeter() {
        double c1 = p1.distance(p2);
        double c2 = p1.distance(p3);
        double c3 = p2.distance(p3);
        return (Double) (c1 + c2 + c3);
    }

    /**
     * hi.
     */
    public String getInfo() {
        String s = "";
        s += "Triangle[";
        s += String.format("(%.2f,%.2f),", p1.getPointX(), p1.getPointY());
        s += String.format("(%.2f,%.2f),", p2.getPointX(), p2.getPointY());
        s += String.format("(%.2f,%.2f)]", p3.getPointX(), p3.getPointY());
        return s;
    }
}